package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 21:10
 * \* Description:
 * \
 */
public class M8 {


    public static void main(String[] args) {


        System.out.println(Stream.of(1,2,3,4,5,6).collect(Collectors.counting()));



    }
}
