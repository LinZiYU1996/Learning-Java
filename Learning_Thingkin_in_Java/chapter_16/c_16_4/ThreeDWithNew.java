package chapter_16.c_16_4;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:07 2020/1/6
 */
public class ThreeDWithNew {

    public static void main(String[] args) {
// 3-D array with fixed length:
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }


}
