package com.mmall.concurrency.example.threadLoacal;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/8:09:03
 */
public class RequestHolder {

    private final static ThreadLocal<Long> requestHolder = new ThreadLocal<>();

    public static void  add (Long id){
        requestHolder.set(id);
    }

    public static Long getId(){
        return requestHolder.get();
    }

    public static void  remove(){
        requestHolder.remove();
    }
}
