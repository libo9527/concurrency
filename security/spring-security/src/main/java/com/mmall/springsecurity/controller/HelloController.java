package com.mmall.springsecurity.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    // 基于表达式的控制1
    @PreAuthorize("#id<10 and principal.username.equals(#username) and #user.username.equals('abc')")
    @PostAuthorize("returnObject%2==0")
    @RequestMapping("/roleAuth")
    public Integer test(Integer id, String username, User user) {
        // ...
        return id;
    }

    // 基于表达式的控制2
    @PreFilter("filterObject%2==0")
    @PostFilter("filterObject%4==0")
    @RequestMapping("/roleAuth")
    public List<Integer> test2(List<Integer> idList) {
        // ...
        return idList;
    }
}
