package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:51
 * \* Description:
 * \
 */
public class StreamMaxMin {

//max(): It finds maximum element for the given Comparator.
//min(): It finds minimum element for the given Comparator.


    public static void main(String[] args) {


        List<String> list = Arrays.asList("G","B","F","E");

        String max = list.stream()
                .max(Comparator.comparing(String::valueOf)).get();

        System.out.println(max);

        String min = list.stream().min(Comparator.comparing(String::valueOf)).get();

        System.out.println(min);

    }
}
