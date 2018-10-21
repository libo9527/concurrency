【5-4】[Boxing and UnBoxing](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/lang/BoxingDemo.java)

* new Integer(2) == 2 ? true

  Java编译器进行了自动插箱

* new Integer(2) == new Integer(2) ? false

  比较的是两个对象的引用值

* Integer.valueOf(2) == Integer.valueOf(2) ? true

  ```java
  // Integer valueOf()源码
  * This method will always cache values in the range -128 to 127,
  * inclusive, and may cache other values outside of this range.
  ```

  **always cache** values in the range -128 to 127

  **may cache** other values outside of this range.

* Integer.valueOf(2).intValue() == 2 ? true

  自动拆箱

* new Integer(2).equals(new Integer(2)) ? true

【6-5】[例一：链表创建](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/recursion/LinkedListCreator.java)

【6-6】[例二：链表反转](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/recursion/LinkedListReverser.java)

![](https://i.loli.net/2018/10/21/5bcc56b671885.jpg)



![](https://i.loli.net/2018/10/21/5bcc56f0ab1b9.jpg)

![](https://i.loli.net/2018/10/21/5bcc570c63386.jpg)

![](https://i.loli.net/2018/10/21/5bcc573071b72.jpg)

【6-7】[例三：列出所有组合](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/recursion/Combinations.java)

【6-10】[例一：链表反转-循环实现](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/loop/LinkedListReverser.java)

> [Google面试官亲授 升级Java面试](https://coding.imooc.com/class/132.html)
>
> 链接: https://pan.baidu.com/s/1Hnuq4jGw2G9n4vS9-1SV_A 提取码: 1mw6