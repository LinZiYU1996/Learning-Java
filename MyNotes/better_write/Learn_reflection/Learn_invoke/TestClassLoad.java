package better_write.Learn_reflection.Learn_invoke;

import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 21:03
 * \* Description:
 * \
 */
public class TestClassLoad {

    public static void main(String[] args) throws Exception {
        Class<?> clz = Class.forName("better_write.Learn_reflection.Learn_invoke.A");
        Object o = clz.newInstance();
        Method m = clz.getMethod("foo", String.class);
        for (int i = 0; i < 16; i++) {
        m.invoke(o, Integer.toString(i));
        }

    }
}
