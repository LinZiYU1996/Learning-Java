package chapter_15.c_15_3;

public interface Generator<T> {


//    方法next()的返回类型是参数化的T。接口使用泛型与类使用泛型没什么区别。
    T next();
}
