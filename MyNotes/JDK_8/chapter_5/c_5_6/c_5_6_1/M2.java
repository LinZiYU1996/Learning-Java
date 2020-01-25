package JDK_8.chapter_5.c_5_6.c_5_6_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 22:27
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        IntStream intStream = menu.stream()

//                将 Stream 转换为数值流
                .mapToInt(Dish::getCalories);


//        将数值流转换为 Stream
        Stream<Integer> stream = intStream.boxed();

        System.out.println(stream.toString());


    }
}
