package com.mmall.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/14:21:11
 */
@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true) // 开启@PreAuthorize
public class HelloController {

    @RequestMapping("/")
    public String home() {
        return "hello spring boot";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')") // 角色验证
    @RequestMapping("/roleAuth")
    public String role() {
        return "admin auth";
    }
}
