package jvm.Learn_MethodHandle.A1;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 15:38
 * \* Description:
 * \
 */
public class T2 {


    public static String getS(String s1,String s2) {

        return s1 + s2 + "///";
    }

    public int cal(int a) {
        return a + 10;
    }

    public static void main(String[] args) throws Throwable {


        MethodType methodType = MethodType.methodType(String.class,
                String.class,String.class);

        MethodHandle mh = MethodHandles.lookup().findStatic(
                T2.class,
                "getS",
                methodType


        );

        String res = (String) mh.invokeExact("a","b");

        System.out.println(res);

        System.out.println("---------------------------------");

        MethodType methodType1 = MethodType.methodType(
                int.class,
                int.class
        );

        MethodHandle mh1 = MethodHandles.lookup().findVirtual(
                T2.class,
                "cal",
                methodType1
        );

        int a = (int) mh1.invoke(1,1);

        System.out.println(a);


    }
}
