package chapter_15.c_15_3;

import java.util.Iterator;
import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:33 2020/1/5
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{

    private Class[] types = { Latte.class, Mocha.class,
            Cappuccino.class, Americano.class, Breve.class, };


    private static Random rand = new Random(47);

//    参数化的Generator接口确保nextO的返回值是参数的类型。CoffeeGenerator同时还实现了
//    Iterable接口，所以它可以在循环语句中使用。不过，它还要一个“末端哨兵”来判断何时停止，
//    这正是第二个构造器的功能。

    public CoffeeGenerator() {}


    // For iteration:
    private int size = 0;


    public CoffeeGenerator(int sz) { size = sz; }


    public Coffee next() {
        try {
            return (Coffee)
                    types[rand.nextInt(types.length)].newInstance();
// Report programmer errors at run time:
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }



    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    };



    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }


    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
    }


}
