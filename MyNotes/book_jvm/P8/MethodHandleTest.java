package book_jvm.P8;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/12
 * \* Time: 11:36
 * \* Description:
 * \
 */
public class MethodHandleTest {


    static class ClassA {

        public void print(String s) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable {

        Object o = System.currentTimeMillis() % 2 == 0 ? System.out
                : new ClassA();

        getPrintMH(o).invokeExact("ic");



    }


    private static MethodHandle getPrintMH(Object reveiver) throws NoSuchMethodException, IllegalAccessException {

        MethodType mt = MethodType.methodType(void.class,String.class);

        return lookup().
                findVirtual(reveiver.getClass(),
                        "print",
                        mt);
    }
}
