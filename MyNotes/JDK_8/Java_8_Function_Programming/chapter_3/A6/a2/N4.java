package JDK_8.Java_8_Function_Programming.chapter_3.A6.a2;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 20:53
 * \* Description:
 * \
 */
public class N4 {


    public static void main(String[] args) {

        System.out.println("--Using DoubleStream.of--");
        DoubleStream.of(5.33,2.34,5.32,2.31,3.51).map(d->d*1.5).forEach(s->System.out.print(s +" "));

        System.out.println("\n--Using DoubleStream.average--");
        double val = DoubleStream.of(12.1,11.2,13.3).average().getAsDouble();
        System.out.println(val);


        System.out.println("--Using DoubleStream.max--");
        val = DoubleStream.of(12.1,11.2,13.3).max().getAsDouble();
        System.out.println(val);


        System.out.println("--Using DoubleStream.filter--");
        DoublePredicate range = d -> d > 12.11 && d < 12.99;
        DoubleStream.of(12.1,11.2,12.3).filter(range).forEach(d->System.out.print(d));

        //--Using DoubleStream.of--
        //7.995 3.51 7.98 3.465 5.265
        //--Using DoubleStream.average--
        //12.200000000000001
        //--Using DoubleStream.max--
        //13.3
        //--Using DoubleStream.filter--
        //12.3
    }
}
