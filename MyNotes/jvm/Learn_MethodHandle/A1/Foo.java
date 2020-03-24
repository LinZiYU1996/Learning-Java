package jvm.Learn_MethodHandle.A1;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 14:39
 * \* Description:
 * \
 */
public class Foo {

    public static void bar(Object o) {
        new Exception().printStackTrace();
    }

    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup l = MethodHandles.lookup();
        MethodType t = MethodType.methodType(void.class, Object.class);
        MethodHandle mh = l.findStatic(Foo.class, "bar", t);
        mh.invokeExact(new Object());
    }
    //通过新建异常实例来查看栈轨迹。打印出来的占轨迹如下所示：

    /*
    java.lang.Exception
	at jvm.Learn_MethodHandle.A1.Foo.bar(Foo.java:18)
	at jvm.Learn_MethodHandle.A1.Foo.main(Foo.java:25)
     */

    //-XX:+UnlockDiagnosticVMOptions +ShowHiddenFrames
}
