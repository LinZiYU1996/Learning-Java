package chapter_17.demo.d6;

import java.lang.reflect.InvocationTargetException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 16:03
 * \* Description:
 * \
 */
public class SpringDetector2 {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        SpringDetector.detectSpring(Groundhog2.class);

    }
}
