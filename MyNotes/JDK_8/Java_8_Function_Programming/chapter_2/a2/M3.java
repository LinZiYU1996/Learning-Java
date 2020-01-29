package JDK_8.Java_8_Function_Programming.chapter_2.a2;

import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 21:53
 * \* Description:
 * \
 */
public class M3 {

    public static int compute_1(int i,
                                Function<Integer,Integer> after,
                                Function<Integer,Integer> before){


        return after.compose(before).apply(i);
    }

    public static int compute_2(int i,
                                Function<Integer,Integer> before,
                                Function<Integer,Integer> after){

        return before.andThen(after).apply(i);

    }

    public static void main(String[] args) {


//        当调用compute1(5,i -> i 2,i -> i i)时，先平方再乘以2所以结果是50。而compute2方法对两个Function的调用正好相反，所以结果是100
        System.out.println(compute_1(
                5,
                i -> i * 2,
                i -> i * i
        ));

        System.out.println(compute_2(
                5,
                i -> i * 2,
                i -> i * i
        ));


    }
}
