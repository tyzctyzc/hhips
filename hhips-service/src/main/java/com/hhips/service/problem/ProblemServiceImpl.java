package com.hhips.service.problem;

import com.github.pagehelper.PageHelper;
import com.hhips.api.problem.ProblemService;
import com.hhips.common.model.PageModel;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.ProblemMapper;
import com.hhips.dao.model.problem.Problem;
import com.hhips.dao.model.problem.ProblemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 描述：TODO<br>
 *
 */
@Service("problemService")
public class ProblemServiceImpl extends BaseServiceImpl<ProblemMapper, Problem, ProblemExample> implements ProblemService {

    @Autowired
    ProblemMapper problemMapper;

    public List<Problem> selectByExampleWithChapterID(/*ProblemExample example, */Integer chapterid) {
        List<Problem> list = null;
        try {
            Method selectByExampleWithChapterID = problemMapper.getClass().getDeclaredMethod("selectByExampleWithChapterID", /*example.getClass(),*/ chapterid.getClass());
            Object result = selectByExampleWithChapterID.invoke(problemMapper, /*example, */chapterid);
            list = (List<Problem>) result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return list;
    }

    public PageModel<Problem> selectByExampleWithChapterIDForOffsetPage(/*ProblemExample example,*/Integer chapterid, Integer offset, Integer limit) {
        PageModel<Problem> pageModel = null;
        try {
            Method selectByExampleWithChapterID = problemMapper.getClass().getDeclaredMethod("selectByExampleWithChapterID", /*example.getClass(),*/ chapterid.getClass());
            PageHelper.offsetPage(offset, limit);
            Object result = selectByExampleWithChapterID.invoke(problemMapper, /*example, */chapterid);
            pageModel = new PageModel<>((List<Problem>) result);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return pageModel;
    }

}
