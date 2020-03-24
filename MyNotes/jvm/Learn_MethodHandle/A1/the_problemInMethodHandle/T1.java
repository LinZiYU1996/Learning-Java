package jvm.Learn_MethodHandle.A1.the_problemInMethodHandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 15:00
 * \* Description:
 * \
 */
public class T1 {

    class GrandFather {
        void thinking() {
            System.out.println("i am grandfather");
        }
    }

    class Father extends GrandFather {
        void thinking() {
            System.out.println("i am father");
        }
    }

    class Son extends Father {
        void thinking() {
            try {
                MethodType mt = MethodType.methodType(void.class);
                MethodHandle mh = lookup().findSpecial(GrandFather.class,
                        "thinking", mt, getClass());
                mh.invoke(this);
            } catch (Throwable e) {
            }
        }
    }

    public static void main(String[] args) {
        (new T1().new Son()).thinking();
        /*
        i am father

         */
    }


    //java7在JSR 292中增加了对动态类型语言的支持，使java也可以像C语言那样将方法作为参数传递，其实现在lava.lang.invoke包中。
    // MethodHandle作用类似于反射中的Method类，但它比Method类要更加灵活和轻量级。通过MethodHandle进行方法调用一般需要以下几步：

    // （1）创建MethodType对象，指定方法的签名；

    // （2）在MethodHandles.Lookup中查找类型为MethodType的MethodHandle；

    // （3）传入方法参数并调用MethodHandle.invoke或者MethodHandle.invokeExact方法。

    // MethodType可以通过MethodHandle类的type方法查看其类型，返回值是MethodType类的对象。也可以在得到MethodType对象之后，调用MethodHandle.asType(mt)方法适配得到MethodHandle对象。
    // 可以通过调用MethodType的静态方法创建MethodType实例，

    // 有三种创建方式：
    // （1）methodType及其重载方法：需要指定返回值类型以及0到多个参数；（
    // 2）genericMethodType：
    // 需要指定参数的个数，类型都为Object；
    // （3）fromMethodDescriptorString：通过方法描述来创建。创建好MethodType对象后，还可以对其进行修改，MethodType类中提供了一系列的修改方法，
    // 比如：changeParameterType、changeReturnType等。LookupMethodHandle.Lookup相当于MethodHandle工厂类，通过findxxx方法可以得到相应的MethodHandle，
    // 还可以配合反射API创建MethodHandle，对应的方法有unreflect、unreflectSpecial等。
    //invoke在得到MethodHandle后就可以进行方法调用了，有三种调用形式：（1）invokeExact:调用此方法与直接调用底层方法一样，需要做到参数类型精确匹配；
    // （2）invoke:参数类型松散匹配，通过asType自动适配；（3）invokeWithArguments:直接通过方法参数来调用。其实现是先通过genericMethodType方法得到MethodType，
    // 再通过MethodHandle的asType转换后得到一个新的MethodHandle，最后通过新MethodHandle的invokeExact方法来完成调用。
    //



}
