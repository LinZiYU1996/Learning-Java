package JDK_8.chapter_5.c_5_2.c_5_2_1;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:03
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());

        System.out.println(wordLengths);
    }
}
