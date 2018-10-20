package com.example.anotation;

import lombok.Data;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/20:09:50
 */
@Data
@Table("user")
public class Filter {


    @Column("id")
    private int id;

    @Column("user_name")
    private String userName;

    @Column("nick_name")
    private String nickName;

    @Column("age")
    private int age;

    @Column("city")
    private String city;

    @Column("email")
    private String email;

    @Column("mobile")
    private String mobile;
}
