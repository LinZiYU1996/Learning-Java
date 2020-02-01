package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:01
 * \* Description:
 * \
 */
public class AveragingDoubleExample {


    //java.util.stream.Collectors is a java 8 class that implements the java.util.stream.Collector interface. Collectors has various methods to reduce and summarize elements of stream. Here we will discuss most of the methods and examples of Collectors class.
    //Collectors.averagingDouble
    //Collectors.averagingDouble calculates the average of stream element as double data type. It returns a Collector instance. The collect method of stream can accept the collector instance and will return the average value calculated by Collectors.averagingDouble.




    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);


        Double res = list.stream()
                .collect(Collectors.averagingDouble(d->d*2));

        System.out.println(res);

    }
}
