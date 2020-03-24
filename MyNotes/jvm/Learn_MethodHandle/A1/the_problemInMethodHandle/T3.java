package jvm.Learn_MethodHandle.A1.the_problemInMethodHandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 15:30
 * \* Description:
 * \
 */
public class T3 {

    public  MethodHandle getToStringMH() {
        MethodHandle mh = null;
        MethodType mt = MethodType.methodType(String.class);
        MethodHandles.Lookup lk = MethodHandles.lookup();

        try {
            mh = lk.findVirtual(getClass(), "toString", mt);
        } catch (NoSuchMethodException | IllegalAccessException mhx) {
            throw (AssertionError)new AssertionError().initCause(mhx);
        }

        return mh;
    }

    public static void main(String[] args) {

//        MethodHandle m1 = getToStringMH();

//        m1.invokeExact()

    }
}
