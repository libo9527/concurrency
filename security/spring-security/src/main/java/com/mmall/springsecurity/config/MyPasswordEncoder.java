package com.mmall.springsecurity.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/15:08:38
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        // Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder(); // 已废弃，因为MD5容易被破译。
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
