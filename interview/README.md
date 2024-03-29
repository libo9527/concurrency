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

【7-3，7-4】[对象的特殊函数](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/oop/Employee.java)

1. eques()  =>  hashCode()

   重写时必须满足此条件。因为在HashMap或HashSet等集合中会先调用hashCode()快速排出一些再调用eques()。

2. Java 1.7之后可以使用Object.equals()和Object.hash()来简化重写时的eques()和hashCode()。

【7-5】[接口和抽象类]

接口和实现类的区别：

* 从实现角度看

  1. 抽象类可以有成员变量
  2. 抽象类可以有部分实现
  3. 抽象类不可以多重继承，接口可以（可参考ArrayList源码）

* 设计接口这个概念的原因

  1. 从用户角度看问题
  2. 强调合约
  3. 强制协作双方无法犯错

* 接口的多重实现

  ![](https://i.loli.net/2018/10/24/5bcfcc9defc50.jpg)

* 抽象类提供一些共有的实现，接口用来描述这个类有什么能力，是两个不同维度的东西。

【7-6】[实现Iterable接口](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/linkedlist/LinkedList.java)

【7-10】[面向对象-不可变性]

final关键字：

* 类申明：类不可以被继承
* 函数申明：函数不可以在派生类中重写
* 变量申明：变量不可以指向其他对象（基本数据类型值就不能再改了，引用类型具体的值是可以改变的。）
* static final 变量：用户定义常量，名称一般大写

**Java中如何把集合定义为一个不可变的集合？？？ **

 【7-11】[泛型]

* 早期Java没有泛型
* 为了兼容性，在运行时将所有泛型内容Erase
  * 运行时：`List`,`List<String>`,`List<Integer>`没有区别
  * 运行时如何知道泛型类型
    * `void <T> printList(List<T> list, class<T> elementType)` 
* 类型转换：
  * `ArrayList<Integer>是List<Integer>`
  * `List<Integer>不是List<Object>`
    * 如果是的话，会存在类型转换异常
  * 把`List<Integer>转换成List<Object>`
    * `new ArrayList<Object>(intList)`
    * `(List<Object>)(List)intList`

语法：

* `List<Integer> list = new ArrayList<>()//java 1.7`
* `class A<T>`
* `public <V> void func(List<V> list)`

【8-1】[设计模式]

* Sigleton
  * 确保全局至多只有一个对象
  * 用于：构造缓慢的对象，需要统一管理的资源
  * 缺点：很多全局状态，线程安全性
  * 创建：
    * 双重锁模式Double checked locking
    * 作为Java类的静态变量
    * 使用框架提供的能力
* [State Pattern](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/designpattern/company/Tester.java)
* [Decorator Pattern](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/designpattern/task/Tester.java)
* 创建对象
  * 使用new来创建的缺点
    * 编译时必须决定创建哪个类的对象
    * 参数意义不明确
  * Abstract Factory Pattern 
  * Builder Pattern
    * 不可变对象往往配合Builder使用

【10-1】[Beautiful Number](https://github.com/libo9527/demo/blob/master/interview/src/main/java/com/demo/interview/google/BeautifulNumber.java)

> [Google面试官亲授 升级Java面试](https://coding.imooc.com/class/132.html)
>
> 链接: https://pan.baidu.com/s/1Hnuq4jGw2G9n4vS9-1SV_A 提取码: 1mw6