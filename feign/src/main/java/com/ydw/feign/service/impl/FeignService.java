package com.ydw.feign.service.impl;

import com.ydw.feign.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yindwe@yonyou.com
 * @Date 2019/6/18
 * @Description
 */
@Service
public class FeignService {
    @Autowired
    private IHelloService helloService;

    public String sayHello(String name){
        return helloService.sayHello(name); // 提供一个hello World
    }
}
