package com.demo.interview.designpattern.task;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/30:09:56
 */
public class Tester {
    public static void main(String[] args) {
        new CodingTask().run();
        new LoggingRunnable(new CodingTask()).run();
        new LoggingRunnable(new TransactionalRunnable(new CodingTask())).run();
    }
}
