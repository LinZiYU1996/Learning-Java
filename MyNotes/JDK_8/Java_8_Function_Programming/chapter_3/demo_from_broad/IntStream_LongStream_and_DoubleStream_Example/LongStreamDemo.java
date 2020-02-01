package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.IntStream_LongStream_and_DoubleStream_Example;

import java.util.stream.LongStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:56
 * \* Description:
 * \
 */
public class LongStreamDemo {

//LongStream
//java.util.stream.LongStream is a sequence of primitive long values and aggregate operations are performed using sequential and parallel operations. Methods are same like IntStream.


    public static void main(String[] args) {

        System.out.println("--Using LongStream.rangeClosed--");
        LongStream.rangeClosed(13, 15).map(n->n*n).forEach(s->System.out.print(s +" "));
        System.out.println("\n--Using LongStream.range--");
        LongStream.range(13,15).map(n->n*n).forEach(s->System.out.print(s +" "));
        System.out.println("\n--Sum of range 1 to 10--");
        System.out.print(LongStream.rangeClosed(1,10).sum());
        System.out.println("\n--Sorted number--");
        LongStream.of(13,4,15,2,8).sorted().forEach(s->System.out.print(s +" "));


    }
}
