package chapter_15.folder.f1;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 18:50 2020/1/7
 */
public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();

        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2);
    }


}
