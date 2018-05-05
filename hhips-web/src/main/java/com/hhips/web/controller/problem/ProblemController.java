package com.hhips.web.controller.problem;

import com.hhips.api.chapter.SysChapterService;
import com.hhips.api.problem.ProblemService;
import com.hhips.api.user.SysUserService;
import com.hhips.common.model.MsgModel;
import com.hhips.common.model.PageModel;
import com.hhips.core.controller.BaseController;
import com.hhips.dao.model.chapter.SysChapter;
import com.hhips.dao.model.problem.Problem;
import com.hhips.dao.model.problem.ProblemExample;
import com.hhips.dao.model.problem.Work;
import com.hhips.dao.model.problem.WorkExample;
import com.hhips.dao.model.user.SysUser;
import com.hhips.dao.model.user.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 名称：UserController<br>
 * <p>
 * 描述：用户管理模块<br>
 *
 */
@Controller
@RequestMapping("/common/problem")
public class ProblemController extends BaseController {

    @Autowired
    private ProblemService problemService;

    @Autowired
    private SysUserService sysUserService;

    private Integer chapterid;

    /**
     * 使用注解获取指定对象的 mapper 映射
     */
    @Autowired
    private SysChapterService sysChapterService;

    @RequestMapping("/manage")
    public String manage() {
        return "common/problem/manage";
    }

    @RequestMapping(value = "/problemlist", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<Problem> problemlist(int offset, int limit, String search, String sort, String order) {
//        ProblemExample example = new ProblemExample();
//        PageModel<Problem> pageModel = problemService.selectByExampleForOffsetPage(example, offset, limit);
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
     * 编辑章节<br>
     *
     * @param chapterId 章节主键
     * @param model  编辑章节对应的模型数据
     * @return String 章节编辑界面
     */
    @RequestMapping("/{chapterId}/showproblem")
    public String edit(@PathVariable String chapterId, Model model) {
        SysChapter chapter = sysChapterService.selectByPrimaryKey(chapterId);
        chapterid = chapter.getChapterChapterid();
        model.addAttribute("chapter", chapter);
        return "common/problem/manage";
    }
}
