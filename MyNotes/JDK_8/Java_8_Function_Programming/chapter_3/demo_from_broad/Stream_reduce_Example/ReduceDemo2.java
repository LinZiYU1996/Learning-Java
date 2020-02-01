package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_reduce_Example;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:35
 * \* Description:
 * \
 */
public class ReduceDemo2 {

//Stream.reduce() with Identity and Accumulator
//Here we will use an identity and accumulator. We will pass the identity as start value.
//
//reduce(T identity, BinaryOperator<T> accumulator)
    public static void main(String[] args) {


        int[] array = {23,43,56,97,32};
        //Set start value. Result will be start value + sum of array.
        int startValue = 100;
        int sum = Arrays.stream(array).reduce(startValue, (x, y) -> x+y);
        System.out.println(sum);
        sum = Arrays.stream(array).reduce(startValue, Integer::sum);
        System.out.println(sum);
        sum = Arrays.stream(array).reduce(startValue, StatisticsUtility::addIntData);
        System.out.println(sum);


    }
}
