package JDK_8.myNotes.J_Stream.D_Stream_of;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 22:05
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        // generator方法，返回一个无限长度的Stream,其元素由Supplier接口的提供。

        Stream<String> stream1 = Stream.generate(
                () ->
                        "A"
        );

//        stream1.forEach(System.out::println);

        Stream<Double> stream2 = Stream.generate(
                ()->
                        Math.random()
        );

//        stream2.forEach(System.out::println);

        Stream<String> stream3 = Stream
                .generate(() -> "love")
                .limit(10);

        stream3.forEach(System.out::println);

    }
}
