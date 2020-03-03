package Effective.P6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/3
 * \* Time: 20:43
 * \* Description:
 * \
 */
public class Demo_2 {

    /*
    每次sum增加时都会构造一个Long类实例，速度变慢。注意：要优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱。
     */

    public static void main(String[] args) {

        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
