package JDK_8.Java_8_Function_Programming.chapter_2.a4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 22:16
 * \* Description:
 * \
 */
public class M2 {

    static Random random = new Random(55);

    public static List<Integer> getNumList(Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public static void supplier(){
        List<Integer> list = getNumList(() ->
                random.nextInt(555));

        list.forEach(System.out::println);
    }

    public static void main(String[] args) {

        supplier();
    }
}
