package JDK_8.Java_8_Function_Programming.chapter_3.A4;

import java.util.*;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 13:23
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "a",
                "bb",
                "ccc",
                "dddd",
                "eeeee"
        );

        Map<Integer, Optional<String>> map =

                strings.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.maxBy(
                                        Comparator.comparing(String::toUpperCase)
                                )
                        )
                );

//{1=Optional[a], 2=Optional[bb], 3=Optional[ccc],
// 4=Optional[dddd], 5=Optional[eeeee]}
        System.out.println(map);

    }
}
