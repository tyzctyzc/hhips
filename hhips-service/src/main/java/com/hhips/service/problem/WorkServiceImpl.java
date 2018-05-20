package com.hhips.service.problem;

import com.hhips.api.problem.WorkService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.WorkMapper;
import com.hhips.dao.model.problem.Work;
import com.hhips.dao.model.problem.WorkExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("workService")
public class WorkServiceImpl extends BaseServiceImpl<WorkMapper, Work, WorkExample> implements WorkService {

    @Autowired
    WorkMapper workMapper;
}
