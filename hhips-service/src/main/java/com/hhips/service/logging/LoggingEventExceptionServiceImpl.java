package com.hhips.service.logging;

import com.hhips.api.logging.LoggingEventExceptionService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.logging.LoggingEventExceptionMapper;
import com.hhips.dao.model.logging.LoggingEventException;
import com.hhips.dao.model.logging.LoggingEventExceptionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("loggingEventExceptionService")
public class LoggingEventExceptionServiceImpl extends BaseServiceImpl<LoggingEventExceptionMapper, LoggingEventException, LoggingEventExceptionExample> implements LoggingEventExceptionService {

    @Autowired
    LoggingEventExceptionMapper loggingEventExceptionMapper;
}
