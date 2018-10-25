package com.demo.interview.linkedlist;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/25:09:55
 */
public class Tester {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 100; i++){
            list.add(i);
        }

        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
