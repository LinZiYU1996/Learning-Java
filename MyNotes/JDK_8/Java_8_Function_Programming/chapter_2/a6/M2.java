package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:07
 * \* Description:
 * \
 */
public class M2 {


    public static void test_1(Integer integer1,Integer integer2,
                              BinaryOperator<Integer> binaryOperator){

        System.out.println(binaryOperator.apply(integer1,integer2));
    }

    //     * 返回两者里面较小的一个
    public static void test_2(String s1, String s2, Comparator<String> comparator){

        System.out.println(BinaryOperator.minBy(comparator).apply(s1,s2));
    }

//     * 返回两者里面较大的一个
    public static void test_3(String s1,String s2,Comparator<String> comparator){

        System.out.println(BinaryOperator.maxBy(comparator).apply(s1,s2));
    }



    public static void main(String[] args) {

        test_1(1,2,(x,y) -> x + y);

        System.out.println("==============================");

        test_1(1,55,(x,y) -> x - y);

        System.out.println("==============================");

        test_2("hello","wonders",(str1,str2)->str1.length()-str2.length());

    }
}
