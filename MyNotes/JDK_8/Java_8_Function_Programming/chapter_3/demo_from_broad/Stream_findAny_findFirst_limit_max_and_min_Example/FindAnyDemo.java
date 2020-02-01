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
public class FindAnyDemo {

//java 8 stream findAny, findFirst, limit, max and min method example. findAny, findFirst, max and min methods return Optional instance and limit method returns stream instance.
//Stream.findAny
//findAny() method can find any element from stream. It returns Optional instance. If there is no data in stream, it returns empty Optional instance.


    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC");
        list.stream().findAny().ifPresent(s->System.out.println(s));

    }
}
