package chapter_11.c_11_13;

import java.util.Iterator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:49 2020/1/2
 */
public class IterableClass implements Iterable<String>{

    protected String[] words = ("And that is how " +
            "we know the Earth to be banana-shaped.").split(" ");


    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            public boolean hasNext() {
                return index < words.length;
            }
            public String next() { return words[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }


    public static void main(String[] args) {
        for(String s : new IterableClass())
            System.out.print(s + " ");
    }
}
