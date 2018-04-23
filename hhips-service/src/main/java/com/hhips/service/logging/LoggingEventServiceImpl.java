package com.hhips.service.logging;

import com.hhips.api.logging.LoggingEventService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.logging.LoggingEventMapper;
import com.hhips.dao.model.logging.LoggingEvent;
import com.hhips.dao.model.logging.LoggingEventExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("loggingEventService")
public class LoggingEventServiceImpl extends BaseServiceImpl<LoggingEventMapper, LoggingEvent, LoggingEventExample> implements LoggingEventService {

    @Autowired
    LoggingEventMapper loggingEventMapper;
}
