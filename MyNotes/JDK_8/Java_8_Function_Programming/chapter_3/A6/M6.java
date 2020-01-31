package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 19:53
 * \* Description:
 * \
 */
public class M6 {


    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> list= new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(598));
        }

        list.stream()
                .filter( integer -> integer % 3 == 0)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("-------");
        list.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}
