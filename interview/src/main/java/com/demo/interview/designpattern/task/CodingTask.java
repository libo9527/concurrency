package com.demo.interview.designpattern.task;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/30:09:46
 */
public class CodingTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Writing code.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
