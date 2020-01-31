package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 17:55
 * \* Description:
 * \
 */
public class M5 {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");

        long i = list.stream().distinct().count();

        System.out.println(i);

        String output = list.stream().distinct().collect(Collectors.joining(","));

        System.out.println(output);

    }
}
