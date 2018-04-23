package com.hhips.web.controller.logging;

import com.github.pagehelper.PageHelper;
import com.hhips.api.logging.LoggingEventExceptionService;
import com.hhips.api.logging.LoggingEventPropertyService;
import com.hhips.api.logging.LoggingEventService;
import com.hhips.common.model.MsgModel;
import com.hhips.common.model.PageModel;
import com.hhips.core.controller.BaseController;
import com.hhips.dao.model.logging.LoggingEvent;
import com.hhips.dao.model.logging.LoggingEventExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 名称：LoggingController<br>
 * <p>
 * 描述：日志查看管理<br>
 *
 */
@Controller
@RequestMapping("/common/logging")
public class LoggingController extends BaseController {

    @Autowired
    private LoggingEventService loggingEventService;

    @Autowired
    private LoggingEventExceptionService loggingEventExceptionService;

    @Autowired
    private LoggingEventPropertyService loggingEventPropertyService;

    /**
     * 日志查看初始化<br>
     *
     * @return String 初始化页面地址
     */
    @RequestMapping("/manage")
    public String manage() {
        return "common/logging/manage";
    }

    /**
     * 日志信息分页查看<br>
     *
     * @param offset 分页起始条数
     * @param limit  分页限制条数
     * @param search 搜索关键词
     * @param sort   排序字段
     * @param order  升序/降序标志
     * @return PageModel<LoggingEvent> 分页结果集
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<LoggingEvent> list(int offset, int limit, String search, String sort, String order) {

        PageHelper.offsetPage(offset, limit);
        LoggingEventExample example = new LoggingEventExample();
        example.setOrderByClause("timestmp desc");
        List<LoggingEvent> list = loggingEventService.selectByExampleWithBLOBs(example);
        return new PageModel<>(list);

    }

    /**
     * 清空日志信息<br>
     *
     * @return MsgModel 消息列表
     */
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel clear() {
        loggingEventPropertyService.deleteByExample(null);
        loggingEventExceptionService.deleteByExample(null);
        loggingEventService.deleteByExample(null);
        return this.resultMsg("删除成功！");
    }

}
