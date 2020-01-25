package JDK_8.chapter_5.c_5_2.c_5_2_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:29
 * \* Description:
 * \
 */
public class Test_5_2_1 {


//    给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？例如，给定[1, 2, 3, 4,
//5]，应该返回[1, 4, 9, 16, 25]。


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares =
                numbers.stream()
                .map( n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squares);



    }
}
