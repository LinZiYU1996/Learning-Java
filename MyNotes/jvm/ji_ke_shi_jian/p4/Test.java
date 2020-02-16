package jvm.ji_ke_shi_jian.p4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/16
 * \* Time: 20:17
 * \* Description:
 * \
 */
public class Test {

    public static void target(int i){

        //打印一下反射调用到目标方法时的栈轨迹
        new Exception("#" + i).printStackTrace();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> kclass = Class.forName("jvm.ji_ke_shi_jian.p4.Test");

        Method method = kclass.getMethod("target",int.class);

        method.invoke(null,0);


//java.lang.Exception: #0
//	at jvm.ji_ke_shi_jian.p4.Test.target(Test.java:17)
//	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//	at java.lang.reflect.Method.invoke(Method.java:498)
//	at jvm.ji_ke_shi_jian.p4.Test.main(Test.java:26)

        /*
        可以看到，反射调用先是调用了 Method.invoke，然后进入委派实现
        （DelegatingMethodAccessorImpl），再然后进入本地实现（NativeMethodAccessorImpl），最
        后到达目标方法。

         */

    }
}
