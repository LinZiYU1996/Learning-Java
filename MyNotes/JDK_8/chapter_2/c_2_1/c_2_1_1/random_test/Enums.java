package JDK_8.chapter_2.c_2_1.c_2_1_1.random_test;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 21:38
 * \* Description:
 * \
 */
public class Enums {

    private static int random=(int)(Math.random()*10);// 生成种子
    private static Random rand = new Random(random);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }




}
