package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:03
 * \* Description:
 * \
 */
public class CollectingAndThenExample {


    //Collectors.collectingAndThen
    //Collectors.collectingAndThen accepts a collection and a function. In our example first we are calculating average by a calculator and then multiplying to itself by a function.




    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4);


        Double res = list.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingLong(value -> value*2),
                        s -> s*s
                ));

        System.out.println(res);
    }
}
