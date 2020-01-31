package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:44
 * \* Description:
 * \
 */
public class StreamCollect {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,5,6);

        int sum = list.stream()
                .collect(Collectors.summingInt(i->i));

        System.out.println(sum);


//        Map<Integer,Object> sum1 = list.stream()
//                .collect(Collectors.summingInt(Function.identity()));


    }
}
