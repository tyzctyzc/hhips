package com.hhips.web.controller.problem;

import com.hhips.api.chapter.SysChapterService;
import com.hhips.api.persistence.DelegateService;
import com.hhips.api.problem.*;
import com.hhips.api.problem.SourceChapterService;
import com.hhips.common.model.MsgModel;
import com.hhips.common.model.PageModel;
import com.hhips.common.util.FileHelper;
import com.hhips.core.controller.BaseController;
import com.hhips.dao.model.chapter.SysChapter;
import com.hhips.dao.model.problem.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 名称：ProblemController<br>
 * <p>
 * 描述：问题管理模块<br>
 *
 */
@Controller
@RequestMapping("/common/problem")
public class ProblemController extends BaseController {

    @Autowired
    private ProblemService problemService;

    @Autowired
    private SourceChapterService sourceChapterService;

    @Autowired
    private ModuleService moduleService;

    @Autowired
    private SysChapterService sysChapterService;

    @Autowired
    private DelegateService delegateService;

    @Autowired
    ServletContext servletContext;

    private Integer chapterid;

    @RequestMapping("/manage")
    public String manage() {
        return "common/problem/manage";
    }

    @RequestMapping(value = "/problemlist", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<Problem> problemlist(int offset, int limit, String search, String sort, String order) {
        ProblemExample example = new ProblemExample();
        PageModel<Problem> pageModel = problemService.selectByExampleWithChapterIDForOffsetPage(/*example, */chapterid, offset, limit);
        return pageModel;
    }

    /**
     * 用户对应角色保存方法<br>
     *
     * @param userId  用户Id
     * @param roleStr 角色列表字符串
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/roleSave", method = RequestMethod.POST)
    @ResponseBody
    public MsgModel roleSave(String userId, String roleStr) {
        List<String> roleIds = Arrays.asList(roleStr.split(","));

        // 先清除历史数据
/*        UserRoleRelExample example = new UserRoleRelExample();
        example.createCriteria().andUserIdEqualTo(userId);
        userRoleRelService.deleteByExample(example);

        // 添加
        for (String roleId : roleIds) {
            if (!this.isNull(roleId.trim())) {
                UserRoleRel userRoleRel = new UserRoleRel();
                userRoleRel.setRelId(this.getUUID());
                userRoleRel.setUserId(userId);
                userRoleRel.setRoleId(roleId);
                userRoleRelService.insertSelective(userRoleRel);
            }
        }*/
        return this.resultMsg("保存成功");
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(HttpServletRequest request) {
        List<String> fileNames = this.fileUpLoad(request);
        System.out.println(fileNames);
        return "success";
    }

    /**
     * Show all problems <br>
     *
     * @param chapterId 章节主键
     * @param model  编辑章节对应的模型数据
     * @return String 章节编辑界面
     */
    @RequestMapping("/{chapterId}/showproblem")
    public String showproblem(@PathVariable String chapterId, Model model) {
        SysChapter chapter = sysChapterService.selectByPrimaryKey(chapterId);
        chapterid = chapter.getChapterChapterid();
        model.addAttribute("chapter", chapter);
        model.addAttribute("chapterid", chapterid);
        return "common/problem/manage";
    }

    /**
     * Add new problem<br>
     *
     * @param problemId problem ID
     * @param model  problem model data
     * @return String the page to add new problem
     */
    @RequestMapping("/{problemId}/add")
    public String add(@PathVariable String problemId, Model model) {
        Problem pProblem = problemService.selectByPrimaryKey(Integer.parseInt(problemId));
        Problem problem = new Problem();
        if(pProblem != null) {
            problem.setProblemchapterid(pProblem.getProblemchapterid());
        } else {
            problem.setProblemchapterid(chapterid);
        }
        SourceChapter sourcechapter = sourceChapterService.selectByPrimaryKey(problem.getProblemchapterid());
        ModuleExample example = new ModuleExample();
        List<Module> listModule = moduleService.selectByExample(example);
        model.addAttribute("chaptername", sourcechapter.getSourcechaptername());
        model.addAttribute("chapterid", problem.getProblemchapterid());
        model.addAttribute("modules", listModule);
        model.addAttribute("problem", problem);
        return "common/problem/addOrEdit";
    }

    /**
     * Edit problem<br>
     *
     * @param problemId problem id
     * @param model  edit problem model data
     * @return String the page to edit problem
     */
    @RequestMapping("/{problemId}/edit")
    public String edit(@PathVariable String problemId, Model model) {
        Problem problem = problemService.selectByPrimaryKey(problemId);
        model.addAttribute("problem", problem);
        return "common/problem/addOrEdit";
    }

    /**
     * 保存问题<br>
     *
     * @param  problem 问题模型数据
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel save(Problem problem) {
        String status = "0";// 状态值，0：刷新本级树，1：刷新父级树
        if(this.isNull(problem.getProblemdetail())) {
            return this.resultMsg(status, "问题不能是空，保存失败！");
        }
        if (this.isNull(problem.getIdproblem())) {
            // 添加操作
            Problem newProblem = new Problem();
            newProblem.setProblemlevel(problem.getProblemlevel());
            newProblem.setProblemchapterid(problem.getProblemchapterid());
            newProblem.setProblemindex(problem.getProblemindex());
            newProblem.setProblemmodule(problem.getProblemmodule());
            newProblem.setProblemanswerstring(problem.getProblemanswerstring());
            newProblem.setProblemcisactive(problem.getProblemcisactive());
            int pID = problemService.insert(newProblem);
            String path = servletContext.getRealPath("") + "\\resources\\images\\";
            FileHelper.setPath(path);
            if(pID > 0) {
                newProblem = delegateService.selectOne("com.hhips.dao.mapper.problem.ProblemMapper.getLastProblem");
                boolean needUpdate = false;
                if (!this.isNull(problem.getProblemdetail())) {
                    if (problem.getProblemdetail().length() > 1) {
                        newProblem.setProblemdetail(FileHelper.saveBase64File(problem.getProblemdetail(), "p", newProblem.getIdproblem()));
                        needUpdate = true;
                    }
                }

                if (!this.isNull(problem.getProblemanswerdetail())) {
                    if (problem.getProblemanswerdetail().length() > 1) {
                        newProblem.setProblemanswerdetail(FileHelper.saveBase64File(problem.getProblemanswerdetail(), "a", newProblem.getIdproblem()));
                        needUpdate = true;
                    }
                }

                if (needUpdate) {
                    problemService.updateByPrimaryKeySelective(newProblem);
                }
            }

            status = "1";
        } else {
            // 修改操作
            problemService.updateByPrimaryKeySelective(problem);
            status = "1";
        }
        return this.resultMsg(status, "保存成功！");
    }

    /**
     * 删除问题<br>
     *
     * @param  problem 问题模型数据
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel delete(Problem problem) {
        int count = problemService.deleteByPrimaryKey(problem.getIdproblem());

        if(count < 1) {
            return this.resultMsg("删除失败！");
        } else {
            return this.resultMsg("删除成功！");
        }
    }

    /**
     * 激活问题<br>
     *
     * @param  problem 问题模型数据
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/active", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel active(Problem problem) {
        int count = problemService.updateByPrimaryKeySelective(problem);

        if(count < 1) {
            return this.resultMsg("激活失败！");
        } else {
            return this.resultMsg("激活成功！");
        }
    }

    /**
     * 不激活问题<br>
     *
     * @param  problem 问题模型数据
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/deactive", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel deactiveProblem(Problem problem) {
        int count = problemService.updateByPrimaryKeySelective(problem);

        if(count < 1) {
            return this.resultMsg("不激活失败！");
        } else {
            return this.resultMsg("不激活成功！");
        }
    }
}
