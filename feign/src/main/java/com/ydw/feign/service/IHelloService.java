package com.ydw.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author yindwe@yonyou.com
 * @Date 2019/6/18
 * @Description
 */
@FeignClient(value = "ribbon-provider")
public interface IHelloService {
    @RequestMapping(value = "/provider/hello",method = RequestMethod.GET)
    String sayHello(@RequestParam String name);
}
