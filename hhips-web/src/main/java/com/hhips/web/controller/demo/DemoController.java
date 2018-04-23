package com.hhips.web.controller.demo;

import com.hhips.api.demo.DemoService;
import com.hhips.api.jms.JmsSenderService;
import com.hhips.api.persistence.DelegateService;
import com.hhips.api.product.TbProductService;
import com.hhips.api.user.SysUserService;
import com.hhips.common.model.PageModel;
import com.hhips.core.controller.BaseController;
import com.hhips.dao.model.product.TbProduct;
import com.hhips.dao.model.product.TbProductExample;
import com.hhips.dao.model.user.SysUser;
import com.hhips.dao.model.user.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 描述：Dubbo RPC 测试类<br>
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {

    /**
     * 获取 demoService 对象
     */
    @Autowired
    private DemoService demoService;

    /**
     * 获取 delegateService 对象
     */
    @Autowired
    private DelegateService delegateService;

    /**
     * 获取 jmsService 对象
     */
    @Autowired
    private JmsSenderService jmsSenderService;

    /**
     * 获取自定义对象 service 服务
     */
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private TbProductService tbProductService;


    /**
     * 调用服务端 dubbo 测试 helloWorld 方法
     *
     * @param name
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(String name) {
        String msg = demoService.sayHello(name);
        return msg;
    }

    /**
     * 执行 example 查询、自定义 sqlMap 查询
     *
     * @return
     */
    @RequestMapping("/test1")
    @ResponseBody
    public List<SysUser> test1() {

        TbProductExample productExample = new TbProductExample();
        List<TbProduct> list1 = tbProductService.selectByExample(productExample);

        SysUserExample example = new SysUserExample();
        List<SysUser> list2 = sysUserService.selectByExample(example);

        List<SysUser> list3 = delegateService.selectList("com.hhips.junit.JunitMapper.getSysUser");

        List<TbProduct> list4 = delegateService.selectList("com.hhips.junit.JunitMapper.getTbProduct");

        return list2;
    }

    /**
     * 自定义sql分页查询方法
     *
     * @return
     */
    @RequestMapping("/test2")
    @ResponseBody
    public PageModel<SysUser> test2() {
        PageModel<SysUser> pageModel = delegateService.selectPagination("com.hhips.junit.JunitMapper.getSysUser", 1, 2);
        return pageModel;
    }

    /**
     * 对象service分页查询
     *
     * @return
     */
    @RequestMapping("/test4")
    @ResponseBody
    public PageModel<SysUser> test4() {
        SysUserExample example = new SysUserExample();
        sysUserService.selectByExampleForStartPage(example, 1, 2);
        PageModel<SysUser> pageModel = sysUserService.selectByExampleForOffsetPage(example, 1, 2);
        return pageModel;
    }

    /**
     * 消息队列测试发送消息方法
     *
     * @return
     */
    @RequestMapping("/test0")
    @ResponseBody
    public String test0() {
        jmsSenderService.sendQueue("hhips.queue", "123456789-hhips.queue");
        return "Jms消息服务发送完毕...";
    }


}
