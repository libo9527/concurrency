package com.mmall.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/7:08:48
 */
@Slf4j
public class SynchronizedExample1 {

    // 修饰一个代码块
    public void test1(int j) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                log.info("test1 - {} - {}", j, i);
            }
        }
    }

    // 修饰一个方法
    // 注意：子类的对象调用父类的同步方法时synchronized是无效的，
    //      因为synchronized不属于方法声明的一部分
    public synchronized void test2(int j) {
        for (int i = 0; i < 10; i++) {
            log.info("test2 - {} - {}", j, i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 example1 = new SynchronizedExample1();
        SynchronizedExample1 example2 = new SynchronizedExample1();
        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(() -> {
//            example1.test1();
//        });
//        executorService.execute(() -> {
//            example1.test1();
//        });

//        executorService.execute(() -> {
//            example1.test2();
//        });
//        executorService.execute(() -> {
//            example1.test2();
//        });

        // 修饰代码块时作用的是当前对象，不同对象之间是不影响的
//        executorService.execute(() -> {
//            example1.test1(1);
//        });
//        executorService.execute(() -> {
//            example2.test1(2);
//        });

        // 修饰方法时作用的是当前对象，不同对象之间是不影响的
        executorService.execute(() -> {
            example1.test2(1);
        });
        executorService.execute(() -> {
            example2.test2(2);
        });
    }
}
