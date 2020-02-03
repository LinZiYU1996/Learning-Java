package JDK_8.myNotes.J_Stream.D_Stream_of;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 22:28
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(
                1,2,3,4,56
        );

        Stream<Integer> stream2 = Stream.of(
                11,258,5689
        );

        Stream<Integer> stream3 = Stream.concat(stream1,stream2);

        stream3.forEach(System.out::println);

        System.out.println("---------");

//        合并多个流（Streams）


        Stream<Integer> first = Stream.of(1, 2);
        Stream<Integer> second = Stream.of(3,4);
        Stream<Integer> third = Stream.of(5, 6);
        Stream<Integer> fourth = Stream.of(7,8);

        Stream<Integer> resultingStream = Stream.concat(first,Stream.concat(second,Stream.concat(third, fourth)));

        resultingStream.forEach(System.out::println);

        System.out.println("---------");


        //合并stream并保留唯一性

        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> secondStream = Stream.of(4, 5, 6, 7, 8, 9);

        Stream<Integer> resultingStream_1 = Stream.concat(firstStream, secondStream)
                .distinct();

        resultingStream_1.forEach(System.out::println);


    }
}
