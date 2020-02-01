package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_collect_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:30
 * \* Description:
 * \
 */
public class AveragingIntExample {


    //Stream.collect() with Collectors.averagingInt()

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);


        Double result = list.stream().collect(Collectors.averagingInt(v->v*2));
        System.out.println("Average: "+result);


    }
}
