package chapter_15.c_15_3;

import java.util.Iterator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:36 2020/1/5
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

    private int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
}