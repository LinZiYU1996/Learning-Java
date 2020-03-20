package jvm.ji_ke_shi_jian.P6.A1;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 17:13
 * \* Description:
 * \
 */
public class Foo {

    private static void bar(Object o){
        System.out.println(o.toString());
    }

    public static MethodHandles.Lookup lookup() {
        return MethodHandles.lookup();
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {

        MethodHandles.Lookup l1 = Foo.lookup();

        Method m = Foo.class.getDeclaredMethod("bar", Object.class);

        MethodHandle mh0 = l1.unreflect(m);

        MethodType t = MethodType.methodType(void.class,Object.class);

        MethodHandle mh1 = l1.findVirtual(Foo.class,"bar",t);



    }
}
