package JDK_8.Java_8_Function_Programming.chapter_3.A3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 11:49
 * \* Description:
 * \
 */
public class M6 {


    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "a",
                "bb",
                "ccc",
                "dddd",
                "eeeee"
        );


        Map<Integer,Long> map = strings.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.counting()
                        )
                );

        System.out.println(map);

    }
}
