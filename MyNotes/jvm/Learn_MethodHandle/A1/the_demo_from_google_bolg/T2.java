package jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 19:17
 * \* Description:
 * \
 */
public class T2 {

    public void hello1()
    {
        System.out.println("hello from hello1");
    }

    private void hello2()
    {
        System.out.println("hello from hello2");
    }

    public static void main(String[] args) throws Throwable
    {
        HW hw = new HW();
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mh = lookup.findVirtual(HW.class, "hello1",
                MethodType.methodType(void.class));
        mh.invoke(hw);
        mh = lookup.findVirtual(HW.class, "hello2",
                MethodType.methodType(void.class));

//        mh.invoke(hw);
    }
}

/*
hello from hello1
Exception in thread "main" java.lang.IllegalAccessException: no such method: jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg.HW.hello2()void/invokeVirtual
	at java.lang.invoke.MemberName.makeAccessException(MemberName.java:867)
	at java.lang.invoke.MemberName$Factory.resolveOrFail(MemberName.java:1003)
	at java.lang.invoke.MethodHandles$Lookup.resolveOrFail(MethodHandles.java:1386)
	at java.lang.invoke.MethodHandles$Lookup.findVirtual(MethodHandles.java:861)
	at jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg.T2.main(T2.java:34)
Caused by: java.lang.IllegalAccessError: tried to access method jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg.HW.hello2()V from class jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg.T2
	at java.lang.invoke.MethodHandleNatives.resolve(Native Method)
	at java.lang.invoke.MemberName$Factory.resolve(MemberName.java:975)
	at java.lang.invoke.MemberName$Factory.resolveOrFail(MemberName.java:1000)
	... 3 more
 */

/*
Listing 2 declares HW (Hello, World) and MHD classes. HW declares a public hello1() instance method and a private hello2() instance method. MHD declares a main() method that will attempt to invoke these methods.

main()'s first task is to instantiate HW in preparation for invoking hello1() and hello2(). Next, it obtains a lookup object and uses this object to obtain a method handle for invoking hello1(). This time, MethodHandles.Lookup's findVirtual() method is called and the first argument passed to this method is a Class object describing the HW class.

It turns out that findVirtual() will succeed, and the subsequent mh.invoke(hw); expression will invoke hello1(), resulting in hello from hello1 being output.

Because hello1() is public, it's accessible to the main() method call site. In contrast, hello2() isn't accessible. As a result, the second findVirtual() invocation will fail with an IllegalAccessException.
 */

class HW
{
    public void hello1()
    {
        System.out.println("hello from hello1");
    }

    private void hello2()
    {
        System.out.println("hello from hello2");
    }
}