package JDK_8.Java_8_Function_Programming.chapter_3.A3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 11:43
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {


        List<String> strings = Arrays.asList(
                "a",
                "bb",
                "ccc",
                "dddd",
                "eeeee"
        );

        Map<Integer,List<String>> map =

                strings.stream()
                .collect(
                        Collectors.groupingBy(String::length)
                );


        System.out.println(map);



    }
}
