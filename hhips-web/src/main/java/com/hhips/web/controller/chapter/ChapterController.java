package com.hhips.web.controller.chapter;

import com.hhips.api.chapter.SysChapterService;
import com.hhips.api.persistence.DelegateService;
import com.hhips.common.model.MsgModel;
import com.hhips.core.controller.BaseController;
import com.hhips.dao.model.chapter.ChapterNode;
import com.hhips.dao.model.chapter.SysChapter;
import com.hhips.dao.model.chapter.SysChapterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 名称：ChapterController<br>
 * <p>
 * 描述：课程章节管理（ztree结构管理）<br>
 *
 */
@Controller
@RequestMapping("/common/chapter")
public class ChapterController extends BaseController {

    private static final String NAMESPACE = "com.hhips.dao.mapper.chapter.SysChapterCustomMapper";

    /**
     * 使用注解获取 delegateMapper 对象
     */
    @Autowired
    private DelegateService delegateService;

    /**
     * 使用注解获取指定对象的 mapper 映射
     */
    @Autowired
    private SysChapterService sysChapterService;

    /**
     * 章节管理初始化<br>
     *
     * @return String 章节管理初始化页面
     */
    @RequestMapping("/manage")
    public String manage() {
        return "common/chapter/manage";
    }

    /**
     * 章节管理树结构（异步加载）<br>
     *
     * @param id 章节主键
     * @return List<ChapterNode> 课程集合
     */
    @RequestMapping(value = "/chapterTree", method = RequestMethod.POST)
    @ResponseBody
    public List<ChapterNode> getChapterTree(String id) {
        if (this.isNull(id)) {
            id = "00000000000000000000000000000000";
        }
        List<ChapterNode> nodeList = new ArrayList<>();
        List<ChapterNode> rootList = delegateService.selectList(NAMESPACE + ".getChapterNode", id);
        for (ChapterNode chapterNode : rootList) {
            chapterNode.setChildren(getChapterNode(chapterNode.getId()));
            nodeList.add(chapterNode);
        }
        return nodeList;
    }

    /**
     * 获取 checkbox 形式的树结构，并获取已选中项（为角色管理提供支持）<br>
     *
     * @param roleId 角色Id
     * @param id     树父Id
     * @return List<ChapterNode> 树结构结果集
     */
    @RequestMapping(value = "/chapterCheckedTree", method = RequestMethod.POST)
    @ResponseBody
    public List<ChapterNode> getChapterCheckedTree(String roleId, String id) {

        if (this.isNull(id)) {
            id = "00000000000000000000000000000000";
        }

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("roleId", roleId);
        paramMap.put("chapterId", id);

        List<ChapterNode> nodeList = new ArrayList<>();
        List<ChapterNode> rootList = delegateService.selectList(NAMESPACE + ".getChapterCheckedNode", paramMap);
        for (ChapterNode chapterNode : rootList) {
            chapterNode.setChildren(getChapterCheckedNode(roleId, chapterNode.getId()));
            nodeList.add(chapterNode);
        }
        return nodeList;
    }

    /**
     * 添加章节节点<br>
     *
     * @param chapterId 章节父节点ID
     * @param model  章节模型数据
     * @return String 添加章节页面
     */
    @RequestMapping("/{chapterId}/add")
    public String add(@PathVariable String chapterId, Model model) {
        SysChapter pChapter = sysChapterService.selectByPrimaryKey(chapterId);
        SysChapter chapter = new SysChapter();
        chapter.setChapterPid(pChapter.getChapterId());
        chapter.setChapterLevel(pChapter.getChapterLevel() + 1);
        chapter.setChapterValid(pChapter.getChapterValid());
        model.addAttribute("chapter", chapter);
        return "common/chapter/addOrEdit";
    }

    /**
     * 编辑章节<br>
     *
     * @param chapterId 章节主键
     * @param model  编辑章节对应的模型数据
     * @return String 章节编辑界面
     */
    @RequestMapping("/{chapterId}/edit")
    public String edit(@PathVariable String chapterId, Model model) {
        SysChapter chapter = sysChapterService.selectByPrimaryKey(chapterId);
        model.addAttribute("chapter", chapter);
        return "common/chapter/addOrEdit";
    }

    /**
     * 保存章节<br>
     *
     * @param chapter 章节模型数据
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel save(SysChapter chapter) {
        String status = "0";// 状态值，0：刷新本级树，1：刷新父级树
        if (this.isNull(chapter.getChapterId())) {
            // 添加操作
            chapter.setChapterId(this.getUUID());
            chapter.setChapterType("chapter");
            sysChapterService.insertSelective(chapter);
            SysChapter pChapter = sysChapterService.selectByPrimaryKey(chapter.getChapterPid());
            if ("chapter".equals(pChapter.getChapterType())) {
                // 修改父节点为 folder
                Map<String, Object> map = new HashMap<>();
                map.put("chapterType", "folder");
                map.put("chapterId", chapter.getChapterPid());
                delegateService.update(NAMESPACE + ".updateChapterType", map);
                status = "1";
            }
        } else {
            // 修改操作
            sysChapterService.updateByPrimaryKeySelective(chapter);
            status = "1";
        }
        return this.resultMsg(status, "保存成功！");
    }

    /**
     * 删除章节<br>
     *
     * @param chapterId  章节主键
     * @param chapterPid 章节父ID
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel delete(String chapterId, String chapterPid) {
        String status = "0";
        SysChapterExample example = new SysChapterExample();
        example.createCriteria().andChapterPidEqualTo(chapterId);
        sysChapterService.deleteByExample(example);// 删除子级数据
        sysChapterService.deleteByPrimaryKey(chapterId);// 删除当前数据
        // 如果父节点下没有子菜单，则修父节点改类型为 chapter
        SysChapterExample pExample = new SysChapterExample();
        pExample.createCriteria().andChapterPidEqualTo(chapterPid);
        List<SysChapter> list = sysChapterService.selectByExample(pExample);
        if (this.isNull(list)) {
            // 修改父节点为 chapter
            Map<String, Object> map = new HashMap<>();
            map.put("chapterType", "chapter");
            map.put("chapterId", chapterPid);
            delegateService.update(NAMESPACE + ".updateChapterType", map);
            status = "1";
        }
        return this.resultMsg(status, "删除成功！");
    }

    /**
     * 章节 tree 结构加载<br>
     *
     * @param sourceid 章节父ID
     * @return List<ChapterNode> 章节节点集合
     */
    private List<ChapterNode> getChapterNode(String sourceid) {
        List<ChapterNode> chapterList = delegateService.selectList(NAMESPACE + ".getChapterNode", sourceid);
        return chapterList;
    }

    /**
     * 章节 checkbox 结构 tree 加载（为角色管理提供支持）<br>
     *
     * @param roleId 角色Id
     * @param pid    父Id
     * @return List<ChapterNode> 章节节点集合
     */
    private List<ChapterNode> getChapterCheckedNode(String roleId, String pid) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("roleId", roleId);
        paramMap.put("chapterId", pid);

        List<ChapterNode> chapterList = delegateService.selectList(NAMESPACE + ".getChapterCheckedNode", paramMap);
        return chapterList;
    }

}