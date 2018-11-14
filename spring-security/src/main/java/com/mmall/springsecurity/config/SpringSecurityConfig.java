package com.mmall.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/14:21:14
 */
@Configuration
@EnableWebSecurity // 开启Spring Security的功能
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() // 定义哪些url需要保护，哪些url不需要保护
                .antMatchers("/").permitAll() // 项目主路径可以直接访问
                .anyRequest().authenticated() // 其他路径都必须经过认证
                .and()
                .logout().permitAll() // 注销可以直接访问
                .and()
                .formLogin();

        // 关闭打开的csrf保护
        // CSRF是指跨站请求伪造（Cross-site request forgery），是web常见的攻击之一。
        // 从Spring Security 4.0开始，默认情况下会启用CSRF保护，以防止CSRF攻击应用程序，Spring Security CSRF会针对PATCH，POST，PUT和DELETE方法进行防护。
        // spring boot项目，在启用了@EnableWebSecurity注解后，csrf保护就自动生效了。
        // 所以在默认配置下，即便已经登录了，页面中发起PATCH，POST，PUT和DELETE请求依然会被拒绝，并返回403，需要在请求接口的时候加入csrfToken才行。
        http.csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
    }
}
