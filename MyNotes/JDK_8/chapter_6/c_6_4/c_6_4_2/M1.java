package JDK_8.chapter_6.c_6_4.c_6_4_2;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 11:03
 * \* Description:
 * \
 */
public class M1 {

//  第一个版本
    public boolean isPrime(int candidate){

//        产生一个自然数//范围，从2开始，//直至但不包括待//测数
        return IntStream.range(2,candidate)
                .noneMatch(i -> candidate % i == 0);

    }

//    优化版本
    public static boolean isPrime_2(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }


    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(
                        partitioningBy(candidate -> isPrime_2(candidate)));
    }



    public static void main(String[] args) {

        System.out.println(partitionPrimes(80));

    }
}
