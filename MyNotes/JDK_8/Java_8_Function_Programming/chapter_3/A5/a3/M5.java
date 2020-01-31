package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 16:25
 * \* Description:
 * \
 */
public class M5 {

    public static void main(String[] args) {


        String[] words = new String[]{"Hello","World"};

        List<String[]> a = Arrays.stream(words)
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());

        //[H, e, l, l, o]
        //[W, o, r, l, d]
        for (String[] s : a){
            System.out.println(Arrays.toString(s));
        }

        System.out.println("---------------------------------");


        List<String> dis = Arrays.stream(words)
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());


        System.out.println(dis);









    }
}
