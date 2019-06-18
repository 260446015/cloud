package com.ydw.ribbon.controller;

import com.ydw.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yindwe@yonyou.com
 * @Date 2019/6/18
 * @Description
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/provider/hello")
    public String sayHello(String name){
        return helloService.sayHello() + " " + name;
    }
}
