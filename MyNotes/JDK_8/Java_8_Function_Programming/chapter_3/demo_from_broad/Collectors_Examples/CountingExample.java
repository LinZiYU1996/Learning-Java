package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:04
 * \* Description:
 * \
 */
public class CountingExample {

    //Collectors.counting
    //Collectors.counting counts the element in the stream.



    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        long result=  list.stream().collect(Collectors.counting());
        System.out.println(result);


    }
}
