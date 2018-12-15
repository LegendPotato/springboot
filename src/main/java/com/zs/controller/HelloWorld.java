package com.zs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshuai_sx
 * @date 2018/12/14 16:48
 */

@RestController
public class HelloWorld {

    @RequestMapping("helloo")
    public String hello(){
        return "hello China!";
    }
}

