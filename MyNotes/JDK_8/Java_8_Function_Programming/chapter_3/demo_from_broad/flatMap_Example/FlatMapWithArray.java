package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:39
 * \* Description:
 * \
 */
public class FlatMapWithArray {


    //Stream flatMap with Array
    //Here we will use flatMap with array. I am creating a two dimensional array with integer data. Finally we will find out even numbers.
    //1. Sample Array
    //{{1,2},{3,4},{5,6}}
    //2. After flatMap(row -> Arrays.stream(row))
    //{1,2,3,4,5,6}
    //3. After filter(num -> num%2 == 0)
    //{2,4,6}
    //Now find the example.



    public static void main(String[] args) {


        Integer[][] data = {{1,2},{3,4},{5,6}};


        Arrays.stream(data)
                .flatMap(row -> Arrays.stream(row))
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);


    }
}
