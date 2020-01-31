package JDK_8.Java_8_Function_Programming.chapter_3.A5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 13:35
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Integer> d = NumData.create();

        Map<Boolean,List<Integer>> map =

                d.stream()
                .collect(
                        Collectors.partitioningBy(integer -> integer>=150)
                );

        System.out.println(map);

//        {
//        false=[75, 63, 129, 86, 1, 38, 12, 90, 130, 41, 30, 40, 141, 106, 111, 55],
//        true=[173, 151, 226, 183, 157, 150, 150, 200, 192, 211, 222, 187, 230, 210]
//        }


    }
}
