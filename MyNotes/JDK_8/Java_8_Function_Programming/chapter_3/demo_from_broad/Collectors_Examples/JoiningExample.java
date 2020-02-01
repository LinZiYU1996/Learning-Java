package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:05
 * \* Description:
 * \
 */
public class JoiningExample {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("A","B","C","D");
        String result=  list.stream().collect(Collectors.joining(",","(",")"));
        System.out.println(result);

    }
}
