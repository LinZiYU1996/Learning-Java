package better_write.Learn_reflection.A2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 20:32
 * \* Description:
 * \
 */
public class T9 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class<?> class_ = Class.forName("better_write.Learn_reflection.A2.Data");

        Data d1 = (Data) class_.newInstance();

        d1.setaChar('a');

        System.out.println(d1.getaChar());


        Field char_field = class_.getDeclaredField("aChar");



        char_field.set(d1,'l');

        System.out.println(d1.getaChar());

        System.out.println(char_field.get(d1));

        System.out.println("--------------------------------------------");

        Data d2 = (Data) class_.getConstructor(float.class,char.class).newInstance(12f,'4');

        System.out.println(d2);

        Method m1 = class_.getDeclaredMethod("m2");

        m1.setAccessible(true);
        m1.invoke(d1);

        Method m2 = class_.getDeclaredMethod("m4");

        m2.invoke(d1);

    }
}
