package JDK_8.Java_8_Function_Programming.chapter_2.a2;

import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 21:43
 * \* Description:
 * \
 */
public class M2 {


    public static int computeLen(String source, Function<String,Integer> function){

        int len = function.apply(source);

        return len;

    }

    public static void main(String[] args) {

//        使用lambda
        System.out.println(computeLen("jdjsajd",(string)->string.length()));

        //使用了方法引用
        System.out.println(computeLen("helo",String::length));




    }
}
