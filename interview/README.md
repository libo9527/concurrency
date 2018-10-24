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

【6-11】[例二：链表中delete_if](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/loop/LinkedListDeletor.java)

【6-12】[二分查找](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/loop/BinarySearch.java)

半开半闭区间的好处：

1. [a, b) + [b, c) = [a, c)
2. b - a = len([a, b))
3. [a, a) ==> empty range

取中位数的注意事项：

1. `(a + b) / 2` 与 `a / 2 + b / 2` 在程序中不等价

​	a = 1, b = 3 -> `a / 2 + b / 2 = 1` and ` (a + b) / 2 = 2` 

2. `(a + b)`may overflow!

   这个bug在之前的Java类库中被隐藏了十年。

   可以改为：`a + (b - a) / 2`

【6-15】[树的遍历](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/tree/TreeTraversal.java)

【6-16】[例一：根据前序中序构造二叉树](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/tree/TreeCreator.java)

【6-17】[例二：寻找中序遍历时的下一结点](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/tree/InOrder.java)

用途：JavaTreeMap和TreeSet的底层使用的搜索树（既二分查找树，再进一步是平衡二叉树），而搜索树的中序遍历是一个有序序列。

【7-3，7-4】对象的特殊函数

1. eques()  =>  hashCode()

   重写时必须满足此条件。因为在HashMap或HashSet等集合中会先调用hashCode()快速排出一些再调用eques()。

2. Java 1.7之后可以使用Object.equals()和Object.hash()来简化重写时的eques()和hashCode()。

> [Google面试官亲授 升级Java面试](https://coding.imooc.com/class/132.html)
>
> 链接: https://pan.baidu.com/s/1Hnuq4jGw2G9n4vS9-1SV_A 提取码: 1mw6