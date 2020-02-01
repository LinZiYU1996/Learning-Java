package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_flatMapToInt_flatMapToLong_and_flatMapToDouble_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:24
 * \* Description:
 * \
 */
public class FlatMapToLongDemo {


    //flatMapToLong
    //It is used for primitive long data type. It returns LongStream.
    //According to java doc.
    //
    //"Returns an LongStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element."



    public static void main(String[] args) {



        long[][] data = {{1L,2L},{3L,4L},{5L,6L}};

        LongStream longStream = Arrays.stream(data)
                .flatMapToLong(row ->Arrays.stream(row));

        System.out.println(longStream.sum());

        long[] l1 = {4l,8l,9l};
        LongDemoPerson p1 = new LongDemoPerson("Ram", l1);
        long[] l2 = {2l,7l,8l};
        LongDemoPerson p2 = new LongDemoPerson("Shyam", l2);
        List<LongDemoPerson> list = Arrays.asList(p1,p2);
        LongStream ls2 = list.stream().flatMapToLong(row -> Arrays.stream(row.getLuckyNum()));
        System.out.println(ls2.min().getAsLong());







    }
}
