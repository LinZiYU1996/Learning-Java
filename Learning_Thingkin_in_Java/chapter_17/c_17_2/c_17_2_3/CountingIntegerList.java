package chapter_17.c_17_2.c_17_2_3;

import java.util.AbstractList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:43 2020/1/6
 */
public class CountingIntegerList extends AbstractList<Integer> {

    private int size;
    public CountingIntegerList(int size) {
        this.size = size < 0 ? 0 : size;
    }
    public Integer get(int index) {
        return Integer.valueOf(index);
    }
    public int size() { return size; }
    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }


}
