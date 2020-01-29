package JDK_8.Java_8_Function_Programming.chapter_2.a5;

import JDK_8.chapter_2.c_2_3.c_2_3_4.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 22:27
 * \* Description:
 * \
 */
public class M2 {


    public static List<String> filterStr(List<String> list,
                                         Predicate<String> predicate){

        List<String> strings = new ArrayList<>();

        list.forEach(str ->
        {
            if (predicate.test(str)){
                strings.add(str);
            }
        });

        return strings;
    }


    public static void predicate(){

        List<String> list = Arrays.asList("Hello", "atguigu", "Lambda", "www", "ok");

        List<String> res = filterStr(list,
                s -> s.length() > 3
                );

        res.forEach(System.out::println);


    }




    public static void main(String[] args) {

            predicate();

    }
}
