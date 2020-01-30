package JDK_8.Java_8_Function_Programming.chapter_3.A1;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 17:54
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {


        //		//生成100以内的30个随机整数，用来构造测试随机数不失为一种简便的方式
        Stream.generate(() ->
                new Random().nextInt(100))
                .limit(30).forEach(System.out::println);


        System.out.println("=================================");
        IntStream.generate(() ->
                (int) (System.nanoTime() % 100)).limit(20).forEach(System.out::println);



        System.out.println("=================================");

//                //random其实提供了更方便的ints()方法
        new Random().ints().limit(10).forEach(System.out::println);
    }
}
