package chapter_15.c_15_4.c_15_4_3;

import chapter_15.c_15_3.Coffee;
import chapter_15.c_15_3.CoffeeGenerator;
import chapter_15.c_15_3.Fibonacci;
import chapter_15.c_15_3.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:10 2020/1/5
 */
public class Generators {

    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffee)
            System.out.println(c);
        Collection<Integer> fnumbers = fill(
                new ArrayList<Integer>(), new Fibonacci(), 12);
        for(int i : fnumbers)
            System.out.print(i + ", ");
    }


}
