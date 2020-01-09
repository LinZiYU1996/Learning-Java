package chapter_16.demo.d4;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 22:18
 * \* Description:
 * \
 */
public class CopyingArrays {

    public static void main(String[] args) {

        int[] i = new int[7];

        int[] j = new int[10];

        Arrays.fill(i,47);

        Arrays.fill(j,99);

        System.out.println("i = " + Arrays.toString(i));

        System.out.println("_____________________________");

        System.out.println("j = " + Arrays.toString(j));

        System.arraycopy(i,0,j,0,i.length);

        int[] k = new int[5];

        Arrays.fill(k,10);

        System.arraycopy(i,0,k,0,k.length);

        System.out.println("k=" + Arrays.toString(k));


    }
}
