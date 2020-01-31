package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:49
 * \* Description:
 * \
 */
public class StreamForEach {


    public static void main(String[] args) {

        Integer[] data = {1,2,3,4,5,6,7};
        System.out.println("---forEach Demo---");
        Arrays.stream(data).filter(num -> num%2 == 1)
                .forEach(s -> System.out.print(s+" "));
        System.out.println("\n---forEachOrdered Demo---");
        Arrays.stream(data).filter(num -> num%2 == 1)
                .forEachOrdered(s -> System.out.print(s+" "));

    }
}
