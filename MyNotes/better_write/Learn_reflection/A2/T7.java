package better_write.Learn_reflection.A2;

import java.lang.reflect.InvocationTargetException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 22:47
 * \* Description:
 * \
 */
public class T7 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> class_ = Data.class;

        // 通过Class对象获取Constructor类对象，从而调用无参构造方法
        Data d1 = (Data) class_.getConstructor().newInstance();

        System.out.println(d1);

        System.out.println("-----------------------------");

        Data d2 = (Data) class_.getConstructor(int.class).newInstance(100);

        System.out.println(d2.getAnInt());




    }
}

/*
better_write.Learn_reflection.A2.Data@1b6d3586
-----------------------------
100
 */
