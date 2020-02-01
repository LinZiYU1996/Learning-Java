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
public class AveragingLongExample {

//.Collectors.averagingLong
//Collectors.averagingLong calculates the average of stream element as long data type.



    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Double result = list.stream().collect(Collectors.averagingLong(v->v*2));
        System.out.println(result);
    }
}
