package chapter_15.c_15_7;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:21 2020/1/5
 */
public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }


}
