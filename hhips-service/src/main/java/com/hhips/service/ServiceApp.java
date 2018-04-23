package com.hhips.service;

/**
 * 描述: 启动dubbo服务方法
 * <p>
 */
public class ServiceApp {

    public static void main(String[] args) {
        System.out.println("Dubbo服务正在启动...");
        com.alibaba.dubbo.container.Main.main(args);
    }

}
