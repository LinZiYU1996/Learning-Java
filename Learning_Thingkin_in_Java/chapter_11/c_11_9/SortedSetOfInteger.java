package chapter_11.c_11_9;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:41 2020/1/2
 */
public class SortedSetOfInteger {

    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }


}
