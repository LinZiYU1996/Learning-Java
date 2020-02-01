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
public class FindFirstDemo {


    //Stream.findFirst
    //findFirst() returns first element of the stream and if stream has defined no encounter order, then it may return any element. If stream is empty, it returns empty Optional instance.
    public static void main(String[] args) {

        List<String> list = Arrays.asList("XX","YY","ZZ");
        list.stream().findFirst().ifPresent(s->System.out.println(s));
    }
}
