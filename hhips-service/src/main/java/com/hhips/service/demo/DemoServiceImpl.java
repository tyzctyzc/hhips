package com.hhips.service.demo;

import com.hhips.api.demo.DemoService;
import org.springframework.stereotype.Service;

/**
 * 名称：DemoServiceImpl<br>
 * <p>
 * 描述：测试接口服务实现类<br>
 *
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {

        System.out.println("Dubbo RPC 远程调用服务端Demo测试方法-开始执行...");
        String str = "Hello '" + name + "', welcome to dubbo.";
        System.out.println("Dubbo RPC 远程调用服务端Demo测试方法执行完毕！");

        return str;
    }

}
