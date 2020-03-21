package better_write.Learn_reflection.A2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 22:50
 * \* Description:
 * \
 */
public class T8 {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


        Class<?> class_ = Data.class;

        Data d1 = (Data) class_.newInstance();

        Method m1 = class_.getMethod("setString", String.class);

        m1.invoke(d1,"hello world");

        System.out.println(d1.getString());





    }
}
