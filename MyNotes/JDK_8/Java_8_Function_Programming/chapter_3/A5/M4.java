package JDK_8.Java_8_Function_Programming.chapter_3.A5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 14:21
 * \* Description:
 * \
 */
public class M4 {

    public static void main(String[] args) {

        List<String> collected = new ArrayList<>();
        for (String string : asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }

        System.out.println(collected);

        List<String> strings = Stream.of("a", "b", "hello")
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(strings);


        System.out.println("-------------------------------");
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
