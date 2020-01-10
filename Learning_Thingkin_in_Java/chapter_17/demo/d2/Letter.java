package chapter_17.demo.d2;

import chapter_15.c_15_3.Generator;

import java.util.Iterator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 10:06
 * \* Description:
 * \
 */
public class Letter implements Generator<Pair<Integer,String>>,Iterable<Integer> {


    private int size = 9;

    private int number = 1;

    private char letter = 'A';


    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number<size;
            }

            @Override
            public Integer next() {
                return number++;
            }
        };

    }

    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++,"" + letter++);
    }


}
