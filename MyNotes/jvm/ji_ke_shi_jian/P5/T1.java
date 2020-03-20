package jvm.ji_ke_shi_jian.P5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 16:46
 * \* Description:
 * \
 */
public class T1 {

    public static void target(int i) {
        new Exception("# " + i).printStackTrace();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> kclass = Class.forName("jvm.ji_ke_shi_jian.P5.T1");

        Method method = kclass.getMethod("target", int.class);

        method.invoke(null,0);
/*
java.lang.Exception: # 0
	at jvm.ji_ke_shi_jian.P5.T1.target(T1.java:17)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at jvm.ji_ke_shi_jian.P5.T1.main(T1.java:26)

	可以看到，反射调用先是调用了 Method.invoke，然后进入委派实现（DelegatingMethodAccessorImpl），再然后进入本地实现（NativeMethodAccessorImpl），最后到达目标方法。


 */
    }
}
