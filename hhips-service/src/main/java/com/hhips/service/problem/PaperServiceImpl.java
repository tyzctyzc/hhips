package com.hhips.service.problem;

import com.hhips.api.problem.PaperService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.PaperMapper;
import com.hhips.dao.model.problem.Paper;
import com.hhips.dao.model.problem.PaperExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("paperService")
public class PaperServiceImpl extends BaseServiceImpl<PaperMapper, Paper, PaperExample> implements PaperService {

    @Autowired
    PaperMapper paperMapper;
}
