package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_reduce_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:37
 * \* Description:
 * \
 */
public class ReduceToString {


    public static void main(String[] args) {


        //Reduce Array to String.
        String[] array = {"Mohan", "Sohan", "Mahesh"};
        Arrays.stream(array).reduce((x, y) -> x +"," + y)
                .ifPresent(s -> System.out.println("Array to String: "+ s));
        //Reduce List to String.
        List<String> list = Arrays.asList("Mohan", "Sohan", "Mahesh");
        list.stream().reduce((x, y) -> x +"," + y)
                .ifPresent(s -> System.out.println("List to String: "+ s));


    }
}
