package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_reduce_Example;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:34
 * \* Description:
 * \
 */
public class ReduceDemo1 {

//Stream.reduce() with Accumulator
//Here we will pass BinaryOperator as accumulator. In case of numeric BinaryOperator, the start value will be 0. In case of string, the start value will be a blank string.
//
//reduce(BinaryOperator accumulator)
//
//The method will return Optional instance. Find the example.
    public static void main(String[] args) {

        int[] array = {23,43,56,97,32};
        Arrays.stream(array).reduce((x, y) -> x+y).ifPresent(s -> System.out.println(s));
        Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
        Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(s -> System.out.println(s));

    }
}
