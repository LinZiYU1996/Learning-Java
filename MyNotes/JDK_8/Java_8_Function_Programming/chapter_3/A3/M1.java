package JDK_8.Java_8_Function_Programming.chapter_3.A3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 21:51
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");


        //分组
        Map<String,List<String>> r1 = items.stream().collect(

                Collectors.groupingBy(Function.identity())
        );


        System.out.println(r1);

        System.out.println("==============");

        //分组计数

        Map<String,Long> r2 = items.stream().collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting())
        );

        System.out.println(r2);

        System.out.println("==============");

        //分组, 计数和排序
        Map<String,Long> map = new LinkedHashMap<>();

        r2.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .forEachOrdered(e -> map.put(e.getKey(),e.getValue()));


        System.out.println(map);


    }
}
