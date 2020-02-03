package JDK_8.myNotes.J_UnaryOperator.the_BinaryOperator.common;

import java.util.function.BinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 20:21
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        BinaryOperator<Integer> b1 = (i1,i2) -> i1 + i2;

        System.out.println(compute_1(100,150,b1));

        System.out.println("-----------------");

        System.out.println(compute_1(102,145,(x,y) -> x * y));

        System.out.println("-----------------");

        BinaryOperator<String> b2 = (s1,s2) -> s1.length() + "---" + s2.length();

        System.out.println(b2.apply("abc","123456"));



    }


    public static Integer compute_1(int a1,int a2,BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a1,a2);

    }
}
