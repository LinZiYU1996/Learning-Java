package better_write.Learn_reflection.A2;

import java.lang.reflect.Constructor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 22:19
 * \* Description:
 * \
 */
public class T4 {


    public static void main(String[] args) {

        Class<?> class_ = Data.class;

        for (Constructor c:class_.getConstructors()) {
            System.out.println(c.getName());
            System.out.println("");
            System.out.println(c.getDeclaringClass());
            System.out.println("");
            System.out.println(c.getModifiers());
            System.out.println("");
            for (Class cc : c.getParameterTypes()) {
                System.out.println("para class type  " + cc);
            }
            System.out.println("---------------------------------------------------");

        }

    }
}
