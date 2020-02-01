package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:07
 * \* Description:
 * \
 */
public class SummingIntExample {

//Collectors.summingInt
//Collectors.summingInt adds all element of stream for integer data type.
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(30,10,20,35);
        int result = list.stream().collect(Collectors.summingInt(i->i));
        System.out.println(result);
    }
}
