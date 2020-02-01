package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Sum_Array_Map_and_List_Collection_Example;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:05
 * \* Description:
 * \
 */
public class SumOfArrayDemo {


    public static void main(String[] args) {

        int[] array = {23,43,56,97,32};
        System.out.println("--Using IntStream.sum()--");

        int sum = Arrays.stream(array).sum();

        System.out.println(sum);
        System.out.println("--Using Stream.reduce() with IntBinaryOperator--");

        IntBinaryOperator binaryOperator = (x,y) -> x + y;

        sum = Arrays.stream(array).reduce(0,binaryOperator);

        System.out.println(sum);
        System.out.println("--Using Stream.reduce() with Integer.sum()--");

        sum = Arrays.stream(array).reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println("--Using custom method--");
        sum = Arrays.stream(array).reduce(0, StatisticsUtility::addIntData);
        System.out.println(sum);

    }
}
