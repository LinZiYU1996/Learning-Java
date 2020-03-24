package jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 19:29
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws Throwable
    {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mh = lookup.findStatic(Math.class, "pow",
                MethodType.methodType(double.class,
                        double.class,
                        double.class));
        mh = MethodHandles.insertArguments(mh, 1, 10);
        System.out.printf("2^10 = %d%n", (int) (double) mh.invoke(2.0));
    }

}
/*
Listing 4 uses a combinator (a method that combines or transforms a pre-existing method handle into a new method handle) to modify the method handle to the pow() method.
In this case, the combinator is MethodHandles's MethodHandle insertArguments(MethodHandle target, int pos, Object... values) method, which inserts a bound argument (10)
into the pre-existing method handle. When invoke() (or invokeExact()) is subsequently called on the new method handle, only a single argument is required.

Additional combinators
MethodHandles supplies additional combinators for permuting arguments, removing arguments, and so on. Combinators let you perform dynamic
language operations such as currying.

Notice the double cast -- (int) (double). invoke()'s return value must be cast to double type to be compatible with the previously specified
method type when
the method handle was obtained (via the findStatic() method call). Because System.out.printf() requires an int value (because of %d), the double
 value must be cast to int.
 */
