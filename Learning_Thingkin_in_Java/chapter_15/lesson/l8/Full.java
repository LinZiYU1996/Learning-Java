package chapter_15.lesson.l8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:06
 * \* Description:
 * \
 */
public class Full {

    public static <T,S extends Iterable<T>> void fill(
            S s, Method method,Object...args
            ){
        Iterator<T> iterator = s.iterator();

        while (iterator.hasNext()){
            T t = iterator.next();
            try {
                method.invoke(t,args);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }


    }
}
