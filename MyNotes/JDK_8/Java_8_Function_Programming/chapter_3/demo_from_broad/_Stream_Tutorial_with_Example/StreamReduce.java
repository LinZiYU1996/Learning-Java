package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:54
 * \* Description:
 * \
 */
public class StreamReduce {


    public static void main(String[] args) {


        int[] array = {3,5,10,15};
        int sum = Arrays.stream(array).reduce(0, (x, y) -> x+y);
        System.out.println("Sum:"+ sum);
    }
}
