package JDK_8.Java_8_Function_Programming.chapter_3.A6.a2;

import chapter_6.c_6_4.Soup1;

import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 20:35
 * \* Description:
 * \
 */
public class N2 {

    public static void main(String[] args) {


        IntStream.rangeClosed(1,10)
                .map(i -> i*i)
                .forEach(System.out::println);


        System.out.println("---------------------------");

        IntStream.range(1,10)
                .map(x->x*x)
                .forEach(System.out::println);

        System.out.println("---------------------------");


        System.out.println(IntStream.rangeClosed(1,50).sum());

        System.out.println("---------------------------");


        IntStream.of(
                1,2,30,8,44,4
        ).sorted()
                .forEach(System.out::println);


    }
}
