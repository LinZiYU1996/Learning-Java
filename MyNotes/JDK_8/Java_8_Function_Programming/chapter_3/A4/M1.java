package JDK_8.Java_8_Function_Programming.chapter_3.A4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 13:16
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "1",
                "22",
                "333",
                "4444",
                "55555"
        );

        Map<Integer,Double> res = strings.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.averagingInt(String::hashCode)
                        )
                );

        //{1=49.0, 2=1600.0, 3=50643.0, 4=1600768.0, 5=5.0578165E7}
        System.out.println(res);

    }
}
