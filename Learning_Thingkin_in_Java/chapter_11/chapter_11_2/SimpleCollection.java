package chapter_11.chapter_11_2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:22 2020/1/2
 */
public class SimpleCollection {

    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing

        for(Integer i : c)
            System.out.print(i + ", ");

    }

}
