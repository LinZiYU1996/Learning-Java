package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:53
 * \* Description:
 * \
 */
public class StreamPeek {

//It is an intermediate operation. It returns a new stream which consists all the elements of stream after applying the Consumer.


    public static void main(String[] args) {


        List<String> list = Arrays.asList("A","B","C");
        list.stream().peek(s->System.out.println(s+s)).collect(Collectors.toList());
    }
}
