package chapter_11.c_11_13;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:51 2020/1/2
 */
public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> ib) {
        for(T t : ib)
            System.out.print(t + " ");
    }
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = { "A", "B", "C" };
// An array works in foreach, but it’s not Iterable:
//! test(strings);
// You must explicitly convert it to an Iterable:
        test(Arrays.asList(strings));
    }


}
