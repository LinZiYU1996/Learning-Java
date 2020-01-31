package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:51
 * \* Description:
 * \
 */
public class StreamMap {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().map(i -> i*i)
                .forEach(s->System.out.print(s+" "));

    }
}
