package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.Recommend;
import com.mmall.concurrency.annotations.ThreadSafe;

/**
 * @Description： 枚举模式：最安全
 * @Auther： libo
 * @date： 2018/11/7:20:32
 */
@ThreadSafe
@Recommend
public class SingletonException7 {

    // 私有构造函数
    private SingletonException7() {

    }

    public static SingletonException7 getInstance() {
       return Singleton.INSTANCE.getSingleton();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonException7 singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new SingletonException7();
        }

        public SingletonException7 getSingleton() {
            return singleton;
        }
    }
}
