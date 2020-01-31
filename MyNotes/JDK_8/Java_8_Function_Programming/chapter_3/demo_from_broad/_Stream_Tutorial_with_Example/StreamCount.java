package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:46
 * \* Description:
 * \
 */
public class StreamCount {


    public static void main(String[] args) {

        Predicate<Integer> p = num -> num % 2 == 0;

        List<Integer> list = Arrays.asList(3,4,6);

        System.out.println("Count: " + list.stream().filter(p).count());


    }
}
