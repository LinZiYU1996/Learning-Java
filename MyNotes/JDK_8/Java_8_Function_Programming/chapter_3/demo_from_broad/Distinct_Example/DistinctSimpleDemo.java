package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Distinct_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:38
 * \* Description:
 * \
 */
public class DistinctSimpleDemo {

    //It is the method of Stream interface. Now find the example. In this example we have a list of string data type that contains duplicate elements.

    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
        long l = list.stream().distinct().count();
        System.out.println("No. of distinct elements:"+l);
        String output = list.stream().distinct().collect(Collectors.joining(","));
        System.out.println(output);
    }
}
