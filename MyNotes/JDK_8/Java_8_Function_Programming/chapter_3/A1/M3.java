package JDK_8.Java_8_Function_Programming.chapter_3.A1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 17:47
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        Stream stream1;

        Stream stream2;

        Stream stream3;
        //由单独的值构成
        Stream<String> stringStream = Stream.of("sjd","kjfu","4545");

        //由数组构成
        String[] strings = new String[]{"a","ab","abc"};

        stream1 = Stream.of(strings);

        stream2 = Arrays.stream(strings);

//        //由集合构成，最常用了
        List<String> list = Arrays.asList(strings);

        stream3 = list.stream();

//对于基本数值型，目前有三种对应的包装类型的Stream：IntStream、LongStream、DoubleStream
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        System.out.println("========================================");
        IntStream.range(1, 3).forEach(System.out::println);
        System.out.println("========================================");
        IntStream.rangeClosed(1, 3).forEach(System.out::println);



    }
}
