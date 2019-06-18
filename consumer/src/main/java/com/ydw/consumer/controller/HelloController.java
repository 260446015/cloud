package com.ydw.consumer.controller;

import com.ydw.consumer.service.HelloService;
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
    private RestTemplate restTemplate;
    @GetMapping("/consumer/hello")
    public String sayHello(String name){
        return restTemplate.getForObject("http://RIBBON-PROVIDER/hello?name=ydw",String.class);
    }
}
