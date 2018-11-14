# volatile的使用

1. 做状态标识量
2. Double Check 双重检测

# 安全发布对象

* 在静态初始化函数中初始化一个对象引用
* 将对象的引用保存到volatile类型域或者AtomicReference对象中
* 将对象的应用保存到某个正确构造对象的final类型域中
* 将对象的引用保存到一个由锁保护的域中

 [各种单例模式的写法](https://github.com/libo9527/demo/tree/master/concurrency/src/main/java/com/mmall/concurrency/example/singleton)

一个小规范：final应该写在static前面

# 线程封闭

数据库连接池就是一种线程封闭的场景

# 并发容器 J.U.C

ConcurrentSkipListSet的add和contains等是原子性操作，但addAll，containsAll等批量操作并非原子性操作。

# 多线程并发最佳实践

* 使用本地变量
* 使用不可变类
* 最小化锁的作用于范围：`S=1/(1-a+a/n)`
* 使用线程池的Executor，而不是直接new Thread执行
* 宁可使用同步也不要使用线程的wait和notify
* 使用BlockingQueue实现生产-消费模式
* 使用并发集合而不是加了锁的同步集合
* 使用Semaphore创建有界的访问
* 宁可使用同步代码块，也不适用同步的方法
* 避免使用静态变量





# 并发与高并发基本概念

1. 并发

   指一个时间段中有几个程序都处于**已启动运行到运行完毕**之间，且这几个程序都是在**同一个处理机上**运行，但**任一个时刻点**上只有一个程序在处理机上运行。

# JAVA内存模型
# 案例环境初始化
# 案例准备工作
# 并发模拟-工具
# 线程安全性-原子性-atomic-1
# 线程安全性-原子性-atomic-2
# 线程安全性-原子性-synchronized
# 线程安全性-可见性
# 线程安全性-有序性与总结
# 安全发布对象-发布与逸出
# 安全发布对象-四种方法-1
# 不可变对象-1
# 不可变对象-2
# 线程封闭
# 线程不安全类与写法-1
# 线程不安全类与写法-2
# 同步容器-1
# 同步容器-2
# 并发容器及安全共享策略总结
# J.U.C之AQS-介绍
# J.U.C之AQS-CountDownLatch
# J.U.C之AQS-Semaphore
# J.U.C之AQS-CyclicBarrier
# J.U.C之AQS-ReentrantLock与锁-1
# J.U.C之AQS-ReentrantLock与锁-2
# J.U.C-FutureTask-1
# J.U.C-FutureTask-2
# J.U.C-ForkJoin
# J.U.C-BlockingQueue
# 线程池-1
# 线程池-2
# 线程池-3
# 死锁
# 并发最佳实践
# Spring与线程安全
# HashMap与ConcurrentHashMap解析
# 多线程并发与线程安全总结
# 扩容思路讲解
# 缓存-特征、场景及组件介绍-1
# 缓存-特征、场景及组件介绍-2
# 缓存-redis的使用讲解-1
# 缓存-redis的使用讲解-2
# 缓存-高并发场景问题讲解
# 消息队列介绍-1
# 消息队列介绍-2
# 消息队列介绍-3
# 应用拆分思路-1
# 应用拆分思路-2
# 应用限流思路-1
# 应用限流思路-2
# 应用限流思路-3
# 服务降级与服务熔断思路-1
# 服务降级与服务熔断思路-2
# 数据库切库分库分表思路
# 高可用一些手段

链接：https://pan.baidu.com/s/1Ti7UtuS5LF6oOMpANwoPyA 
提取码：gick