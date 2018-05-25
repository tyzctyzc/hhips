package com.hhips.service.problem;

import com.github.pagehelper.PageHelper;
import com.hhips.api.problem.WorkService;
import com.hhips.common.model.PageModel;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.WorkMapper;
import com.hhips.dao.model.problem.Work;
import com.hhips.dao.model.problem.WorkExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 描述：TODO<br>
 *
 */
@Service("workService")
public class WorkServiceImpl extends BaseServiceImpl<WorkMapper, Work, WorkExample> implements WorkService {

    @Autowired
    WorkMapper workMapper;

    public PageModel<Work> selectByExampleWithProblemIDForOffsetPage(Integer problemid, Integer offset, Integer limit) {
        PageModel<Work> pageModel = null;
        try {
            Method selectByExampleWithProblemID = workMapper.getClass().getDeclaredMethod("selectByExampleWithProblemID", problemid.getClass());
            PageHelper.offsetPage(offset, limit);
            Object result = selectByExampleWithProblemID.invoke(workMapper, problemid);
            pageModel = new PageModel<>((List<Work>) result);
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
