package chapter_15.lesson.l1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 10:59
 * \* Description:
 * \
 */
public class ListOfInt {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        for (int i : list){
            System.out.println(i);
        }

    }
}
