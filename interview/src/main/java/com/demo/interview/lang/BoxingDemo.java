package com.demo.interview.lang;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/21:18:08
 */
public class BoxingDemo {
    public static void main(String[] args) {

        System.out.println("new Integer(2) == 2 ? " + (new Integer(2) == 2));
        System.out.println("new Integer(2) == new Integer(2) ? " + (new Integer(2) == new Integer(2)));
        System.out.println("Integer.valueOf(2) == Integer.valueOf(2) ? " + (Integer.valueOf(2) == Integer.valueOf(2)));
        System.out.println("Integer.valueOf(2).intValue() == 2 ? " + (Integer.valueOf(2).intValue() == 2));
        System.out.println("new Integer(2).equals(new Integer(2)) ? " + (new Integer(2).equals(new Integer(2))));
    }
}
