package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_findAny_findFirst_limit_max_and_min_Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:21
 * \* Description:
 * \
 */
public class StreamMaxMin {

//Stream.max() and Stream.min()
//max() method returns maximum element on the basis of given comparator. It returns Optional instance. min() method returns minimum element on the basis of given comparator. It returns Optional instance.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("G","B","F","E");

        String max = list.stream()
                .max(Comparator.comparing(String::valueOf)).get();

        System.out.println(max);

        String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println("Min:"+ min);

    }
}
