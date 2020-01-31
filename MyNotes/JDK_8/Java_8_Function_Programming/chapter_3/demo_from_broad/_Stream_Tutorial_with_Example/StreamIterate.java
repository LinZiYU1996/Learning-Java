package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class StreamIterate {


    public static void main(String[] args) {


        //We need to pass seed value and UnaryOperator to this method and it will return an infinite sequential unordered stream.

        Stream<Integer> stream = Stream.iterate(1, n  ->  n * 2).limit(5);
        stream.forEach(s->System.out.print(s+" "));

    }
}
