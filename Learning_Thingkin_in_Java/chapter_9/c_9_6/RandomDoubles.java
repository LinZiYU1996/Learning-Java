package chapter_9.c_9_6;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:13 2019/12/29
 */
public class RandomDoubles {

    private static Random rand = new Random(47);
    public double next() { return rand.nextDouble(); }
    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for(int i = 0; i < 7; i ++)
            System.out.print(rd.next() + " ");
    }


}
