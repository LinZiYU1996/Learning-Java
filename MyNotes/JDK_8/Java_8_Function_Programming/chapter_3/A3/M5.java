package JDK_8.Java_8_Function_Programming.chapter_3.A3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 11:46
 * \* Description:
 * \
 */
public class M5 {


    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "a",
                "bb",
                "ccc",
                "dddd",
                "eeeee"
        );

        TreeMap<Integer,List<String>> map =

                strings.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                TreeMap::new,
                                Collectors.toList()
                        )
                );

        System.out.println(map);


    }
}
