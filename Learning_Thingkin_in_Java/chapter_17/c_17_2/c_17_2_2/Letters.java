package chapter_17.c_17_2.c_17_2_2;

import chapter_15.c_15_3.Generator;

import java.util.Iterator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:38 2020/1/6
 */
public class Letters implements Generator<Pair<Integer,String>>,
        Iterable<Integer> {

    private int size = 9;
    private int number = 1;
    private char letter = 'A';
    public Pair<Integer,String> next() {
        return new Pair<Integer,String>(
                number++, "" + letter++);
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public Integer next() { return number++; }
            public boolean hasNext() { return number < size; }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
