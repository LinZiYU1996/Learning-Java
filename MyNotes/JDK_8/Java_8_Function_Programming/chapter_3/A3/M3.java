package JDK_8.Java_8_Function_Programming.chapter_3.A3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 22:27
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        Map<Boolean, List<Integer>> map = Stream.of(
                1,2,3,4,5,6
        ).collect(
                Collectors.partitioningBy(x -> x>2)
        );

        System.out.println(map);

        System.out.println("---------------------------------------------");

        Map<Boolean, Long> longMap = Stream.of(1, 3, 3, 2).collect(Collectors.partitioningBy(x -> x > 1, Collectors.counting()));

        System.out.println(longMap);

        //{false=[1, 2], true=[3, 4, 5, 6]}
        //---------------------------------------------
        //{false=1, true=3}



    }
}
