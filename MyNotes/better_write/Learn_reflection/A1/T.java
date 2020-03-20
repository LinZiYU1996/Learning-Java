package better_write.Learn_reflection.A1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 22:12
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //正常的调用
        Person person = new Person();
        person.setWeight(50.45);
        System.out.println( person.getWeight());
        //使用反射调用
        Class clz = Class.forName("better_write.Learn_reflection.A1.Person");
        Method setPriceMethod = clz.getMethod("setWeight", double.class);
        Constructor Constructor = clz.getConstructor();
        Object Obj = Constructor.newInstance();
        setPriceMethod.invoke(Obj, 60.33);
        Method getMethod = clz.getMethod("getWeight");
        System.out.println(getMethod.invoke(Obj));

    }
}
