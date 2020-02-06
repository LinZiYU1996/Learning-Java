package JDK_8.myNotes.J_Stream;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 21:21
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

//        /*************流的来源*************/
        // 1、of方法
        //      of(T... values)：返回含有多个T元素的Stream
        //      of(T t)：返回含有一个T元素的Stream

        Stream<String> stream1 = Stream.of(
                "a","b","c","d","e"
        );

        stream1.forEach(System.out::println);

        System.out.println("--------------------");

        String[] strings = {"a","45","a"};

        Stream<String> stream2 = Stream.of(strings);

        stream2.forEach(System.out::println);

//        Collectors

//        Optional

//        OptionalInt


    }
}
