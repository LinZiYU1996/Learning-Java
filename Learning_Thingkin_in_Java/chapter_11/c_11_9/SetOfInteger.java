package chapter_11.c_11_9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:40 2020/1/2
 */
public class SetOfInteger {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }


}
