package com.chenxyz.rpcframework.test.controller;

import com.chenxyz.rpcframework.test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-04-28
 */
@Controller
@RequestMapping
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello(String name) {
        System.out.println("准备调用方法...");
        String reuslt = helloService.sayHello(name);
        System.out.println("返回成功！！！");
        return reuslt;
    }
}
