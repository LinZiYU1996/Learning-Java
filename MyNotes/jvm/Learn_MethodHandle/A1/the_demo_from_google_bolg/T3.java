package jvm.Learn_MethodHandle.A1.the_demo_from_google_bolg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/23
 * \* Time: 19:22
 * \* Description:
 * Q: Listings 1 and 2 use the invokeExact() and invoke() methods to execute a method handle. What's the difference between these methods?
 *
 * A: Although invokeExact() and invoke() are designed to execute a method handle (actually, the target code to which the method handle refers), they differ when it comes to performing type conversions on arguments and the return value. invokeExact() doesn't perform automatic compatible-type conversion on arguments. Its arguments (or argument expressions) must be an exact type match to the method signature, with each argument provided separately, or all arguments provided together as an array. invoke() requires its arguments (or argument expressions) to be a type-compatible match to the method signature -- automatic type conversions are performed, with each argument provided separately, or all arguments provided together as an array.
 *
 * Q: Can you provide me with an example that shows how to invoke an instance field's getter and setter?
 *
 * A: Check out Listing 3.
 * \
 */
public class T3 {

    public static void main(String[] args) throws Throwable
    {
        MethodHandles.Lookup lookup = MethodHandles.lookup();

        Point point = new Point();

        // Set the x and y fields.

        MethodHandle mh = lookup.findSetter(Point.class, "x",
                int.class);
        mh.invoke(point, 15);

        mh = lookup.findSetter(Point.class, "y", int.class);
        mh.invoke(point, 30);

        mh = lookup.findGetter(Point.class, "x", int.class);
        int x = (int) mh.invoke(point);
        System.out.printf("x = %d%n", x);

        mh = lookup.findGetter(Point.class, "y", int.class);
        int y = (int) mh.invoke(point);
        System.out.printf("y = %d%n", y);
    }


}
class Point
{
    int x;
    int y;
}

/*
Listing 3 introduces a Point class with a pair of 32-bit integer instance fields named x and y. Each field's setter and getter is accessed by calling MethodHandles.Lookup's findSetter() and findGetter() methods, and the resulting MethodHandle is returned. Each of findSetter() and findGetter() requires a Class argument that identifies the field's class, the field's name, and a Class object that identifies the field's signature.

The invoke() method is used to execute a setter or getter-- behind the scenes, the instance fields are accessed via the JVM's putfield and getfield instructions. This method requires that a reference to the object whose field is being accessed be passed as the initial argument. For setter invocations, a second argument, consisting of the value being assigned to the field, also must be passed.
 */