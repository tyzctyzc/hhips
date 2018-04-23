package com.hhips.service.logging;

import com.hhips.api.logging.LoggingEventPropertyService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.logging.LoggingEventPropertyMapper;
import com.hhips.dao.model.logging.LoggingEventProperty;
import com.hhips.dao.model.logging.LoggingEventPropertyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("loggingEventPropertyService")
public class LoggingEventPropertyServiceImpl extends BaseServiceImpl<LoggingEventPropertyMapper, LoggingEventProperty, LoggingEventPropertyExample> implements LoggingEventPropertyService {

    @Autowired
    LoggingEventPropertyMapper loggingEventPropertyMapper;
}
