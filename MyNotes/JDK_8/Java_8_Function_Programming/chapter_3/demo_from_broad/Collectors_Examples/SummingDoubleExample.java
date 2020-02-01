package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:08
 * \* Description:
 * \
 */
public class SummingDoubleExample {

    //Collectors.summingDouble
    //Collectors.summingDouble adds all element of stream for double data type.



    public static void main(String[] args) {

        List<Double> list = Arrays.asList(340.5,234.56,672.76);

        Double res = list.stream()
                .collect(Collectors.summingDouble(Double::doubleValue));

        System.out.println(res);

    }
}
