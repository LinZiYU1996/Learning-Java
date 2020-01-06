package chapter_15.c_15_2.c_15_2_3;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:16 2020/1/5
 */
public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<T>();

    private Random rand = new Random(47);

    public void add(T item) { storage.add(item); }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }


    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s: ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
    }
}
