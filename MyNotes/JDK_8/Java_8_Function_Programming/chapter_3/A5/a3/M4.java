package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 15:53
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(
                1,2,3,4,56
        );

        List<Integer> list2 = Arrays.asList(
                256,455,45,65665,565
                );


        List<Integer> list3 = Arrays.asList(
                0,59,1454,5656,6554,21546
                );


        List<List<Integer>> num = Stream.of(
                list1,list2,list3
        ).map(Function.identity()).collect(Collectors.toList());

        //[
        // [1, 2, 3, 4, 56],
        // [256, 455, 45, 65665, 565],
        // [0, 59, 1454, 5656, 6554, 21546]
        // ]
        System.out.println(num);


        System.out.println("------------------------------");


        List<Integer> together =

                Stream.of(list1,list2,list3)
                .flatMap(list -> list.stream())
                .map(Function.identity()).collect(Collectors.toList());

        System.out.println(together);



    }
}
