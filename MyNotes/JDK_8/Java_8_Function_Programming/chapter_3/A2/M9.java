package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 21:15
 * \* Description:
 * \
 */
public class M9 {


    public static void main(String[] args) {

        Map<Boolean, List<Integer>> c = Stream.of(1,2,3,4,5,6,7)
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println(c);


        Map<Boolean, List<Integer>> c1 = Stream.of(25,158,566,45,122)
                .collect(Collectors.groupingBy(i -> i > 100));

        System.out.println(c1);



    }
}
