package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.NotThreadSafe;

/**
 * @Description： 懒汉模式：单例实例在第一次使用时进行创建
 * @Auther： libo
 * @date： 2018/11/7:19:52
 */
@NotThreadSafe
public class SingletonExample6 {

    // 私有构造函数
    private SingletonExample6() {

    }

    // 注意静态域的执行顺序
//    static {
//        instance = new SingletonExample6();
//    }
//    // 单例对象
//    private static SingletonExample6 instance = null;

    // 单例对象
    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }

    // 静态的工厂方法
    public static SingletonExample6 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        SingletonExample6 instance = SingletonExample6.getInstance();
        System.out.println(instance);
        System.out.println(instance);
    }
}
