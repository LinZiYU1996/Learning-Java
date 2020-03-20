package jvm.ji_ke_shi_jian.P5;

import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 16:50
 * \* Description:
 * \
 */
public class T2 {

    public static void target(int i) {
        new Exception("#" + i).printStackTrace();
    }

/*
考虑到许多反射调用仅会执行一次，Java 虚拟机设置了一个阈值 15
（可以通过 -Dsun.reflect.inflationThreshold= 来调整），
当某个反射调用的调用次数在 15 之下时，采用本地实现；当达到 15 时，
便开始动态生成字节码
，并将委派实现的委派对象切换至动态实现，这个过程我们称之为 Inflation。
 */


    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("jvm.ji_ke_shi_jian.P5.T2");
        Method method = klass.getMethod("target", int.class);
        for (int i = 0; i < 20; i++) {
            method.invoke(null, i);
        }
    }

    /*
    java.lang.Exception: #15
	at jvm.ji_ke_shi_jian.P5.T2.target(T2.java:15)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at jvm.ji_ke_shi_jian.P5.T2.main(T2.java:22)
java.lang.Exception: #16
	at jvm.ji_ke_shi_jian.P5.T2.target(T2.java:15)
	at sun.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at jvm.ji_ke_shi_jian.P5.T2.main(T2.java:22)

	可以看到，在第 15 次（从 0 开始数）反射调用时，
	我们便触发了动态实现的生成。这时候，Java 虚拟机额外加载了不少类。
	其中，最重要的当属 GeneratedMethodAccessor1。
	并且，从第 16 次反射调用开始，我们便切换至这个刚刚生成的动态实现

     */
}
