package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_flatMapToInt_flatMapToLong_and_flatMapToDouble_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:21
 * \* Description:
 * \
 */
public class FlatMapToIntDemo {

//On this page we will provide Java 8 Stream flatMapToInt, flatMapToLong and flatMapToDouble example. flatMapToInt is used for int data type, flatMapToLong for long data type and flatMapToDouble for double data type. They behave same as flatMap but for primitive data types.



    public static void main(String[] args) {


        //flatMapToInt
        //It is used for primitive int data type. It returns IntStream.
        //According to java doc.
        //
        //"Returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element."
        //
        //Now find the example.

        int[][] data = {{1,2},{3,4},{5,6}};


        IntStream intStream = Arrays.stream(data)
                .flatMapToInt(row -> Arrays.stream(row));

        System.out.println(intStream.sum());



        int[] l1 = {4,8,9};
        IntDemoPerson p1 = new IntDemoPerson("Ram", l1);
        int[] l2 = {2,7,8};
        IntDemoPerson p2 = new IntDemoPerson("Shyam", l2);


        List<IntDemoPerson> list = Arrays.asList(p1,p2);


        IntStream intStream2 = list.stream()
                .flatMapToInt(row ->
                        Arrays.stream(row.getLuckyNum()));


        System.out.println(intStream2.max().getAsInt());


    }
}
