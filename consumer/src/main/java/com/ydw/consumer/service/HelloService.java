package com.ydw.consumer.service;

import org.springframework.stereotype.Service;

/**
 * @Author yindwe@yonyou.com
 * @Date 2019/6/18
 * @Description
 */
@Service
public class HelloService {

    public String sayHello(){
        return "helloWorld"; // 提供一个hello World
    }
}
