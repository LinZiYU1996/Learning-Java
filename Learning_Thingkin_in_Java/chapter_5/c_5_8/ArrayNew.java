package chapter_5.c_5_8;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:11 2019/12/25
 */
public class ArrayNew {

    static Random rand = new Random();
    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main(String[] args) {
        int[] a;
        a = new int[pRand(20)];
        prt("length of a = " + a.length);
        for(int i = 0; i < a.length; i++)
            prt("a[" + i + "] = " + a[i]);
    }
    static void prt(String s) {
        System.out.println(s);
    }

//    由于数组的大小是随机决定的（使用早先定义的pRand()方法），所以非常明显，数组的创建实际是在运行
//    期间进行的。除此以外，从这个程序的输出中，大家可看到基本数据类型的数组元素会自动初始化成“空”
//    值（对于数值，空值就是零；对于 char，它是null；而对于boolean，它却是 false）。
//    当然，数组可能已在相同的语句中定义和初始化了，如下所示：
//    int[] a = new int[pRand(20)];

}
