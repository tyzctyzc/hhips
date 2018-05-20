package com.hhips.service.problem;

import com.hhips.api.problem.SourceService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.SourceMapper;
import com.hhips.dao.model.problem.Source;
import com.hhips.dao.model.problem.SourceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("sourceService")
public class SourceServiceImpl extends BaseServiceImpl<SourceMapper, Source, SourceExample> implements SourceService {

    @Autowired
    SourceMapper sourceMapper;
}
