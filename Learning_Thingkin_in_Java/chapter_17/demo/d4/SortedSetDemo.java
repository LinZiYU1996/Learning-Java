package chapter_17.demo.d4;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 22:07
 * \* Description:
 * \
 */
public class SortedSetDemo {

    public static void main(String[] args) {

        SortedSet<String> strings = new TreeSet<>();

        Collections.addAll(strings,"J JKJK jJKJKHGGHF HJHJ".split(" "));

        System.out.println(strings);

        System.out.println("______________________________________________");

        String low = strings.first();

        String high = strings.last();

        System.out.println(low);

        System.out.println("______________________________________________");

        System.out.println(high);

        System.out.println("______________________________________________");

        Iterator<String> iterator = strings.iterator();

        for (int i = 0; i <=3 ; i++) {

            if (i == 3){
                low = iterator.next();
            } else {
                iterator.next();
            }

        }

        System.out.println(low);

        System.out.println("______________________________________________");

        System.out.println(high);

        System.out.println("______________________________________________");

        System.out.println(strings.subSet(low,high));

    }
}
