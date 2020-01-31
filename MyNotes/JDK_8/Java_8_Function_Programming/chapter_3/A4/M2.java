package JDK_8.Java_8_Function_Programming.chapter_3.A4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 13:19
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "1",
                "22",
                "333",
                "4444",
                "55555",
                "aa",
                "aa",
                "aaa"
        );


        Map<Integer,Integer> map = strings.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.summingInt(String::length)
                        )
                );

//{1=1, 2=6, 3=6, 4=4, 5=5}
        System.out.println(map);

    }
}
