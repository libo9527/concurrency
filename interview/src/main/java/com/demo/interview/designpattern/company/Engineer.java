package com.demo.interview.designpattern.company;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/30:09:13
 */
public class Engineer implements Role{

    @Override
    public void doWork() {
        System.out.println("Doing engineer work.");
    }

    @Override
    public String toString() {
        return "Engineer";
    }
}
