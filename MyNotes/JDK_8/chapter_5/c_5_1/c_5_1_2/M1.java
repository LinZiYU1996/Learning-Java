package JDK_8.chapter_5.c_5_1.c_5_1_2;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 19:53
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);


//        筛选出列表中所有的偶数，并确保没有
//重复


        numbers.stream()
                .filter( i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);



    }
}
