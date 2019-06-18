package com.ydw.feign.controller;

import com.ydw.feign.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yindwe@yonyou.com
 * @Date 2019/6/18
 * @Description
 */
@RestController
public class HelloController {
    @Autowired
    private IHelloService helloService;
    @GetMapping("/feign/hello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}
