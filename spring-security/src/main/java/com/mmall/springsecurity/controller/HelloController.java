package com.mmall.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/14:21:11
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String home() {
        return "hello spring boot";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
