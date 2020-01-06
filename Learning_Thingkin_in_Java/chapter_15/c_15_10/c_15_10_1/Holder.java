package chapter_15.c_15_10.c_15_10_1;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Fruit;
import chapter_15.c_15_10.Orange;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:23 2020/1/6
 */
public class Holder<T> {

    private T value;
    public Holder() {}
    public Holder(T val) { value = val; }
    public void set(T val) { value = val; }
    public T get() { return value; }
    public boolean equals(Object obj) {
        return value.equals(obj);
    }



    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);
// Holder<Fruit> Fruit = Apple; // Cannot upcast
        Holder<? extends Fruit> fruit = Apple; // OK
        Fruit p = fruit.get();
        d = (Apple)fruit.get(); // Returns ‘Object’
        try {
            Orange c = (Orange)fruit.get(); // No warning
        } catch(Exception e) { System.out.println(e); }
// fruit.set(new Apple()); // Cannot call set()
// fruit.set(new Fruit()); // Cannot call set()
        System.out.println(fruit.equals(d)); // OK
    }




}
