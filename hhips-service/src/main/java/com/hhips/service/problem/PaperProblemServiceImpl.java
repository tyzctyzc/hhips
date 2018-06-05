package com.hhips.service.problem;

import com.github.pagehelper.PageHelper;
import com.hhips.api.problem.PaperProblemService;
import com.hhips.common.model.PageModel;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.PaperproblemMapper;
import com.hhips.dao.model.problem.Paperproblem;
import com.hhips.dao.model.problem.PaperproblemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 描述：TODO<br>
 *
 */
@Service("paperProblemService")
public class PaperProblemServiceImpl extends BaseServiceImpl<PaperproblemMapper, Paperproblem, PaperproblemExample> implements PaperProblemService {

    @Autowired
    PaperproblemMapper paperProblemMapper;

    public PageModel<Paperproblem> selectByPaperID(Integer paperid, Integer offset, Integer limit) {
        PageModel<Paperproblem> pageModel = null;
        try {
            Method selectByPaperID = paperProblemMapper.getClass().getDeclaredMethod("selectByPaperID", paperid.getClass());
            PageHelper.offsetPage(offset, limit);
            Object result = selectByPaperID.invoke(paperProblemMapper, paperid);
            pageModel = new PageModel<>((List<Paperproblem>) result);
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
