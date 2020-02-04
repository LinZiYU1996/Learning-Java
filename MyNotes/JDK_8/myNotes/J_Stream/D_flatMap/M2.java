package JDK_8.myNotes.J_Stream.D_flatMap;


import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 11:13
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        double[][] data = {{1.5,2.4},{3.2,4.4},{5.2,6.8}};


        Arrays.stream(data)
                .map( doubles -> doubles)
                .forEach(System.out::println);

        //[D@7cca494b
        //[D@7ba4f24f
        //[D@3b9a45b3

        System.out.println("--------------------------------");

        Arrays.stream(data)
                .flatMapToDouble(r -> Arrays.stream(r))
                .forEach(System.out::println);

        //1.5
        //2.4
        //3.2
        //4.4
        //5.2
        //6.8

        System.out.println("--------------------------------");


        int[][] data1 = {{1,2},{3,4},{5,6}};


        IntStream intStream = Arrays.stream(data1)
                .flatMapToInt(row -> Arrays.stream(row));

        System.out.println(intStream.sum());


    }
}
