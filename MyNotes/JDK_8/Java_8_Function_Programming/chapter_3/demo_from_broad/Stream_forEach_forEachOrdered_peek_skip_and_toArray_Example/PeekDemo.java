package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_forEach_forEachOrdered_peek_skip_and_toArray_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:14
 * \* Description:
 * \
 */
public class PeekDemo {

//Stream.peek
//peek() is an intermediate operation. It returns a new stream which consists all the elements of stream after applying the Consumer.


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10,11,12);
        list.stream().peek(i->System.out.println(i*i)).collect(Collectors.toList());


    }
}
