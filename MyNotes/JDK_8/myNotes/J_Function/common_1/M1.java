package JDK_8.myNotes.J_Function.common_1;

import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:35
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Function<Integer,Integer> function1 = integer ->
                integer + integer;

        System.out.println(function1.apply(100));

        System.out.println("-----------------");

        Function<Integer,String> function2 = integer ->
        {
            return integer + "号";
        };

        System.out.println(calculate(function2,100));

        System.out.println("-----------------");

        Function<Integer,String> function3 = integer ->
        {
            if (integer >= 100) {
                return " >= 100";
            } else {
                return " < 100 ";
            }
        };

        System.out.println(calculate(function3,1000));


    }


    //通过传入不同的Function，实现了在同一个方法中实现不同的操作。在实际开发中这样可以大大减少很多重复的代码
    public static String calculate(Function<Integer,String> function,
                                   Integer integer) {
        return  function.apply(integer);
    }
}
