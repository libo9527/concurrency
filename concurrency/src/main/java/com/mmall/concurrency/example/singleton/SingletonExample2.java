package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.ThreadSafe;

/**
 * @Description：
 * 饿汉模式：单例实例在类装载时进行创建
 * 缺点：
 * 1. 构造函数中的处理过多时导致加载太慢
 * 2. 程序运行过程中未被使用导致浪费
 * @Auther： libo
 * @date： 2018/11/7:19:52
 */
@ThreadSafe
public class SingletonExample2 {

    // 私有构造函数
    private SingletonExample2() {

    }

    // 单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    // 静态的工厂方法
    public static SingletonExample2 getInstance() {
        return instance;
    }

}
