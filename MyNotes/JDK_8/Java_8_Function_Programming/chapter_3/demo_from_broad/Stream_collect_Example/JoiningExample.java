package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_collect_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:26
 * \* Description:
 * \
 */
public class JoiningExample {

//Stream.collect() with Collectors.joining()


    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram","Shyam","Shiv","Mahesh");

        String result=  list.stream().collect(Collectors.joining(", "));
        System.out.println("Joining Result: "+ result);

    }
}
