package Effective.P7;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/4
 * \* Time: 20:25
 * \* Description:
 * \
 */
public class Stack {

    /*
    简单实现栈的例子

    这段程序中并没有很明显的错误，但是其中隐藏着一个问题。不严格的讲，这段程序中有一个“内存泄露”，随着垃圾回收器活动的增加，程序性能的降低会逐渐表现出来，
    在极端的情况下，这种内存泄露会导致磁盘交换（Disk Paging）,甚至导致程序失败（OutOfMemoryError错误），但是这种情况比较少见。

那么，程序中哪里发生了内存泄露呢？如果一个栈先是增长，然后再收缩，那么，从栈中弹出来的对象将不会被当做垃圾回收，即使使用栈的程序不再引用这些对象，它们也不会被回收。
这是因为，栈内部维护者对这些对象的过期引用（obsolete reference）。所谓的过期引用，是指永远也不会再被解除的引用。在本例中，凡是在elements数组的“活动部分（active portion）”之外的任何引用都是过期的。
活动部分是指elements中下标小于size的那些元素。

在支持垃圾回收的语言中，内存泄露是很隐蔽的（成这类内存泄露为“无意识地对象保持（unintentional object retention）”更为恰当），如果一个对象被无意识地保留起来了，那么垃圾回收机制不仅不会处理这个对象，
而且也不会这个对象所引用的其它对象。
     */
    private Object[] elements;

    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {

        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }


    /*
    这类问题的修复方法很简单：一旦对象引用已经过期，只需要清空这些引用即可。对于上述例子中的Stack类而言，只要一个单元被弹出栈，指向它的引用就过期了。可以对pop方法做如下修改：

public Object pop() {
    if(size == 0)
        throw new EmptyStackException();
    Object result = elements[--size];
    elements[size] = null;
    return result;
}

     */
    public Object pop() {

        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements,2*size+1);
        }
    }

    /*
    注意：清空对象引用应该是一种例外，而不是一种常规行为。消除过期引用最好的办法就是让包含该引用的变量结束其生命周期。

那么何时该清空引用呢？

一般而言，只要类是自己管理内存，程序员就应该警惕内存泄露问题。一旦元素被释放掉，则该元素中包含的任何对象引用都应该被清空。

内存泄露的另一个常见来源是缓存。一旦你把对象引用放到缓存中，它就很容易被遗忘掉，从而使得它不再有用之后的很长一段时间仍然留在缓存中。

解决方案：如果你正好要实现这样的缓存：只要缓存之外存在对某个项的键的引用，该项就有意义，那么就可以用WeakHashMap代替缓存；当缓存中的项过期之后，它们就会自动被删除。记住只有当所要的缓存项的生命周期是由该键的外部引用而不是由值决定时，WeakHashMap才有用处。

更为常见的情形则是，“缓存项的生命周期是否有意义”，并不是很容易确定，随着时间的推移，其中的项会变得越来越没有价值。在这种情况下，缓存应该不时地清除掉没用项。这项清除工作可以给一个后台线程（可能是Timer或者SchduledThreadPoolExecutor）来完成，或者也可以在给缓存添加新条目凡人时候顺便进行清理。LinkedHashMap类利用它的removeEldestEntry方法可以很容易地实现后一种方案。对于更复杂的缓存，必须直接使用java.lang.ref。

内存泄露的第三个常见的来源是监听器和其它回调。如果你实现了一个API，客户端在这个API注册回调，却没有显式地取消注册，那么除非你采取某些动作，否则他们就会积聚。确保回调立即被当做垃圾回收的最佳方法是只保存它们的弱引用（weak reference），例如只将它们保存成WeakHashMap中的键。
     */
}
