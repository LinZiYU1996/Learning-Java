package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 17:45
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                1554,565,5658,55
        );

        //找出最大值
        System.out.println(
                list.stream()
                .reduce(Integer::max).get()
        );

        //统计集合里面多少个元素
        System.out.println(

                list.stream()
                .collect(Collectors.counting())
        );
        ////统计集合里面多少个元素
        System.out.println(
                list.stream()
                .map(integer -> integer = 1)
                .reduce(0,(x,y) -> x+y)

        );





    }
}
