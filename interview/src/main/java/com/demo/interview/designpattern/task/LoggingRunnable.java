package com.demo.interview.designpattern.task;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/30:09:46
 */
public class LoggingRunnable implements Runnable {

    private final Runnable innerRunnable;

    public LoggingRunnable(Runnable innerRunnable) {
        this.innerRunnable = innerRunnable;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("Task started at " + startTime);
        innerRunnable.run();
        System.out.println("Task finished. Elapsed time: " + (System.currentTimeMillis() - startTime));
    }
}
