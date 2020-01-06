package chapter_15.c_15_4.c_15_4_4;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:11 2020/1/5
 */
public class BasicGenerator<T> implements Generator<T> {

//    这个类提供了个基本实现，用以生成某个类的对象。这个类必需具备两个特点：
//    (1)它必须声明为public。（因为BasicGenerator与要处理的类在不同的包中，所以该类必须声明为
//    public, 并且不只具有包内访问权限。）(2)它必须具备默认的构造器（无参数的构造器）。
//    要创建这样的BasicGenerator对象，只需调用create()方法，并传人想要生成的类型。泛型化的
//    create()方法允许执行BasicGenerator.create(MyType.class)1而不必执行麻烦的
//    newBasic­Generator<MyType>(MyType.class)。
    private Class<T> type;


    public BasicGenerator(Class<T> type){ this.type = type; }


    public T next() {
        try {
// Assumes type is a public class:
        return type.newInstance();
    } catch(Exception e) {
        throw new RuntimeException(e);
    }
    }



    // Produce a Default generator given a type token:

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
