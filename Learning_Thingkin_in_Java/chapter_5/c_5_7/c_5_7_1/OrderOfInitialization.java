package chapter_5.c_5_7.c_5_7_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:55 2019/12/24
 */
public class OrderOfInitialization {

//    在一个类里，初始化的顺序是由变量在类内的定义顺序决定的。即使变量定义大量遍布于方法定义的中间，
//    那些变量仍会在调用任何方法之前得到初始化——甚至在构建器调用之前。


//    因此，t3句柄会被初始化两次，一次在构建器调用前，一次在调用期间（第一个对象会被丢弃，所以它后来
//    可被当作垃圾收掉）。从表面看，这样做似乎效率低下，但它能保证正确的初始化——若定义了一个过载的
//    构建器，它没有初始化 t3；同时在t3 的定义里并没有规定“默认”的初始化方式，那么会产生什么后果
//    呢？

    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }


}
