package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad._Stream_Tutorial_with_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:54
 * \* Description:
 * \
 */
public class StreamToArray{


    public static void main(String[] args) {


        List<String> list = Arrays.asList("A", "B", "C", "D");
        Object[] array = list.stream().toArray();
        System.out.println("Length of array: "+array.length);


    }
}
