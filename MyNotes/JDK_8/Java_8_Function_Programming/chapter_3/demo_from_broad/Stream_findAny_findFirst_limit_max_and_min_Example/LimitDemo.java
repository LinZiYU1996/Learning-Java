package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_findAny_findFirst_limit_max_and_min_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:20
 * \* Description:
 * \
 */
public class LimitDemo {

//Stream.limit
//limit() method of stream API returns stream instance with the given number of element in limit as an argument. limit() method selects the elements from start. We need to pass a max value and it returns the stream up to the max number of elements.


    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC","DD","EE");
        list.stream().limit(3).forEach(s->System.out.println(s));
    }
}
