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