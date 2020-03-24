package jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 19:16
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws Throwable
    {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mh = lookup.findStatic(T1.class, "hello",
                MethodType.methodType(void.class));
        mh.invokeExact();
    }

    static void hello()
    {
        System.out.println("hello");
    }


    //MethodHandles also declares a MethodHandles.Lookup publicLookup() method.
    // Unlike lookup(), which can be used to obtain a method handle to any
    // accessible method/constructor or field, publicLookup() can be used
    // to obtain a method handle to a publicly accessible field or publicly
    // accessible method/constructor only.


}
