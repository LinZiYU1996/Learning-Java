package chapter_16.c_16_7.c_16_7_1;

import java.util.Arrays;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:23 2020/1/6
 */
public class CopyingArrays {

    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        print("i = " + Arrays.toString(i));
        System.out.println("_________________________________");
        print("j = " + Arrays.toString(j));
        System.out.println("_________________________________");
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("_________________________________");
        print("j = " + Arrays.toString(j));
        System.out.println("_________________________________");
        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        print("k = " + Arrays.toString(k));
        System.out.println("_________________________________");
        Arrays.fill(k, 103);
        System.arraycopy(k, 0, i, 0, k.length);
        print("i = " + Arrays.toString(i));
        System.out.println("_________________________________");
// Objects:
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, new Integer(99));
        print("u = " + Arrays.toString(u));
        System.out.println("_________________________________");
        print("v = " + Arrays.toString(v));
        System.out.println("_________________________________");
        System.arraycopy(v, 0, u, u.length/2, v.length);
        print("u = " + Arrays.toString(u));
    }
}
