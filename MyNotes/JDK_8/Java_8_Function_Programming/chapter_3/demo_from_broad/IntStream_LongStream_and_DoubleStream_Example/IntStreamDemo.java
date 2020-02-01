package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.IntStream_LongStream_and_DoubleStream_Example;

import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:49
 * \* Description:
 * \
 */
public class IntStreamDemo {

//LongStream and DoubleStream. IntStream, LongStream and DoubleStream are the specialization of primitive int stream, primitive long stream and primitive double stream respectively. These interfaces have many useful methods. They are initialized by using static method provided in the class.



    public static void main(String[] args) {


        //.IntStream
        //java.util.stream.IntStream is a sequence of primitive integer values. The aggregate operations like max and average can be performed using sequential and parallel operations.
        //rangeClosed(a,b): The values from a to be are considered by incrementing 1.
        //range(a,b) : Values from a to b-1 are considered.
        //sum: Calculates the sum of values.
        //sorted: Values are sorted.
        //Find the example of IntStream.



        System.out.println("--Using IntStream.rangeClosed--");
        IntStream.rangeClosed(13, 15).map(n->n*n).forEach(s->System.out.print(s +" "));
        System.out.println("\n--Using IntStream.range--");
        IntStream.range(13,15).map(n->n*n).forEach(s->System.out.print(s +" "));
        System.out.println("\n--Sum of range 1 to 10--");
        System.out.print(IntStream.rangeClosed(1,10).sum());
        System.out.println("\n--Sorted number--");
        IntStream.of(13,4,15,2,8).sorted().forEach(s->System.out.print(s +" "));


    }
}
