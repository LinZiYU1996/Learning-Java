package JDK_8.myNotes.J_Stream.D_flatMap;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 10:52
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );

        // 把所有元素统一放入一个List里面
//
//        inputStream.map(integers -> integers)
//                .forEach(System.out::println);
        //输出
        //[1]
        //[2, 3]
        //[4, 5, 6]

        //可以看到Map操作无法完成这个任务  它的输出是一个个的小流

        System.out.println("------------------");

        inputStream.flatMap(integers -> integers.stream())
                .forEach(System.out::println);


        System.out.println("-----------------------------------");

        /**
         *      Stream flatMap with Array
         *     Here we will use flatMap with array. I am creating a two dimensional array with integer data. Finally we will find out even numbers.
         *     1. Sample Array
         *     {{1,2},{3,4},{5,6}}
         *     2. After flatMap(row -> Arrays.stream(row))
         *     {1,2,3,4,5,6}
         *     3. After filter(num -> num%2 == 0)
         *     {2,4,6}
         *     Now find the example.
         */

        Integer[][] data = {{1,2},{3,4},{5,6}};


        Arrays.stream(data)
                .flatMap(row -> Arrays.stream(row))
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");


        List<List<Integer>> out = new ArrayList<>();

        List<Integer> inner1 = Create_Data.supply_Integers();

        List<Integer> inner2 = Create_Data.supply_Integers();

        List<Integer> inner3 = Create_Data.supply_Integers();

        out.add(inner1);out.add(inner2);out.add(inner3);

        out.stream()
                .flatMap(r -> r.stream())
                .forEach(System.out::println);

        System.out.println("-----------------------------------");



        List<String> list1 = Arrays.asList("AAA","BBB");
        List<String> list2 = Arrays.asList("CCC","DDD");

        Stream.of(list1,list2)
                .flatMap(list -> list.stream())
                .forEach(System.out::println);



    }
}
