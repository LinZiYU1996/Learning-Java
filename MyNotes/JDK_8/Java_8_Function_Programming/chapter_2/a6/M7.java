package JDK_8.Java_8_Function_Programming.chapter_2.a6;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:34
 * \* Description:
 * \
 */
public class M7 {


    public static void test(int a, Predicate<Integer> predicate){

        if (predicate.test(a)){
            System.out.println(a);
            System.out.println("====================");
        }

    }

    public static void main(String[] args) {

        Random random = new Random(55);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
                list.add(random.nextInt(500));
        }

        for (Integer integer : list){
            test(integer,i -> i>=100);
        }

    }
}
