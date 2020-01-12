package chapter_19.c_19_6;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 11:57
 * \* Description:
 * \
 */
public class Enums {


//    随机选择

//  <T extends Enum<T>>  表示T是一个enum实例

//    Class<T>作为参数我们就可以利用Class对象得到enum实例的数组了


    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }
    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
