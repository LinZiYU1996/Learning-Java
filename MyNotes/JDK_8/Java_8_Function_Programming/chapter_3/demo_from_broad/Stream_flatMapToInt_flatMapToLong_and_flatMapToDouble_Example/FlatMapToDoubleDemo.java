package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_flatMapToInt_flatMapToLong_and_flatMapToDouble_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:26
 * \* Description:
 * \
 */
public class FlatMapToDoubleDemo {

    //flatMapToDouble
    //It is used for primitive double data type. It returns DoubleStream.
    //According to java doc.
    //
    //"Returns an DoubleStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element"


    public static void main(String[] args) {


        double[][] data = {{1.5,2.4},{3.2,4.4},{5.2,6.8}};
        DoubleStream ds1 = Arrays.stream(data).flatMapToDouble(row -> Arrays.stream(row));
        System.out.println(ds1.average().getAsDouble());

        double[] d1 = {60.5,58.9, 62.5};
        DoubleDemoPerson p1 = new DoubleDemoPerson("Ram", d1);
        double[] d2 = {70.5,65.3,67.4};
        DoubleDemoPerson p2 = new DoubleDemoPerson("Shyam", d2);
        List<DoubleDemoPerson> list = Arrays.asList(p1,p2);
        DoubleStream ds2 = list.stream().flatMapToDouble(row -> Arrays.stream(row.getWeightsInAYear()));
        System.out.println(ds2.min().getAsDouble());


    }


}
