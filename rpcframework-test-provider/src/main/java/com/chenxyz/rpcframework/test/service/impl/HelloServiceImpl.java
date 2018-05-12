package com.chenxyz.rpcframework.test.service.impl;

import com.chenxyz.rpcframework.test.service.HelloService;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-04-26
 * Copyright 青海粮食云项目组
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("成功调用sayHello方法！！");
        return "Hello, " + name + "!";
    }
}
