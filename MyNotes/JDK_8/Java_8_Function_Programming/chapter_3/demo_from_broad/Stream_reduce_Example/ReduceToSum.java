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
public class ReduceToSum{

    public static void main(String[] args) {


        //Reduce Array to sum.
        int[] array = {30, 10, 20, 40};
        int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
        System.out.println("Sum of Array: "+ sum);
        //Reduce List to sum.
        List<Integer> list = Arrays.asList(30, 10, 20, 40);
        sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum of List: "+ sum);

    }
}

