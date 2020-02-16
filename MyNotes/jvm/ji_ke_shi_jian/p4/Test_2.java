package jvm.ji_ke_shi_jian.p4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/16
 * \* Time: 20:24
 * \* Description:
 * \
 */
public class Test_2 {

    public static void target(int i){
        new Exception("#" + i).printStackTrace();
    }

//动态实现和本地实现相比，其运行效率要快上 20 倍 [2] 。这是因为动态实现无需经过 Java 到 C++
//再到 Java 的切换，但由于生成字节码十分耗时，仅调用一次的话，反而是本地实现要快上 3 到 4
//倍 [3]。
//考虑到许多反射调用仅会执行一次，Java 虚拟机设置了一个阈值 15（可以通过 -
//Dsun.refect.infationThreshold= 来调整），当某个反射调用的调用次数在 15 之下时，采用本地实
//现；当达到 15 时，便开始动态生成字节码，并将委派实现的委派对象切换至动态实现，这个过程
//我们称之为 Infation。

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        Class<?> kclass = Class.forName("jvm.ji_ke_shi_jian.p4.Test_2");

        Method method = kclass.getMethod("target", int.class);

        for (int i = 0; i < 20; i++) {
            method.invoke(null,i);
        }


        //java.lang.Exception: #14
        //	at jvm.ji_ke_shi_jian.p4.Test_2.target(Test_2.java:17)
        //	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        //	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        //	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        //	at java.lang.reflect.Method.invoke(Method.java:498)
        //	at jvm.ji_ke_shi_jian.p4.Test_2.main(Test_2.java:28)
        //java.lang.Exception: #15
        //	at jvm.ji_ke_shi_jian.p4.Test_2.target(Test_2.java:17)
        //	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        //	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        //	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        //	at java.lang.reflect.Method.invoke(Method.java:498)
        //	at jvm.ji_ke_shi_jian.p4.Test_2.main(Test_2.java:28)
        //java.lang.Exception: #16
        //	at jvm.ji_ke_shi_jian.p4.Test_2.target(Test_2.java:17)
        //	at sun.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)
        //	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        //	at java.lang.reflect.Method.invoke(Method.java:498)
        //	at jvm.ji_ke_shi_jian.p4.Test_2.main(Test_2.java:28)

/*
在第 15 次（从 0 开始数）反射调用时，我们便触发了动态实现的生成。这时候，Java
虚拟机额外加载了不少类。其中，最重要的当属 GeneratedMethodAccessor1。并
且，从第 16 次反射调用开始，我们便切换至这个刚刚生成的动态实现
 */

    }
}
