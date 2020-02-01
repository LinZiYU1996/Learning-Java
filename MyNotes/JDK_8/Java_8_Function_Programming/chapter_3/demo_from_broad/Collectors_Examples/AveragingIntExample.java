package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:02
 * \* Description:
 * \
 */
public class AveragingIntExample {


    //Collectors.averagingInt
    //Collectors.averagingInt calculates average of stream element as integer data type.



    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);


        Double res = list.stream()
                .collect(Collectors.averagingInt(value -> value*2));

        System.out.println(res);
    }
}
