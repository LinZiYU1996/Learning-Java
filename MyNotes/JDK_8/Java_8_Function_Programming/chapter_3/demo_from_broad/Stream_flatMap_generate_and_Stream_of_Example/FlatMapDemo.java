package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_flatMap_generate_and_Stream_of_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:17
 * \* Description:
 * \
 */
public class FlatMapDemo {

    //Stream.flatMap()
    //Stream.flatMap() returns the stream object. We need to pass a function as an argument.
    // Function will be applied to each element of stream and result will be flattened..



    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("AAA","BBB");
        List<String> list2 = Arrays.asList("CCC","DDD");

        Stream.of(list1,list2)
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
    }
}
