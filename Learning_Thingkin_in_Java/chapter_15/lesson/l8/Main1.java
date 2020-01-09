package chapter_15.lesson.l8;

import chapter_15.c_15_2.c_15_2_1.TwoTuple;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:01
 * \* Description:
 * \
 */
public class Main1 {

    public static void getData(Object type){
        Class<?> c = type.getClass();

        try {
            Method method = c.getMethod("getData");

            int data = (int) method.invoke(type,null);

            System.out.println(type.getClass().getSimpleName()+"  data:"+data);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        TypeOne one = new TypeOne();

        TypeTwo typeTwo = new TypeTwo();

        getData(one);

        getData(typeTwo);

    }
}
