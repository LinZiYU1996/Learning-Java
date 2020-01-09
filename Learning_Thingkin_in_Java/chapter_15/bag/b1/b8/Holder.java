package chapter_15.bag.b1.b8;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Fruit;
import chapter_15.c_15_10.Orange;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 9:55
 * \* Description:
 * \
 */
public class Holder<T> {

    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {

        Holder<Apple> holder = new Holder<>(new Apple());

        Apple apple =holder.getValue();

        holder.setValue(apple);

        Holder<? extends Fruit> f = holder;

        Fruit fruit = f.getValue();

        apple = (Apple) f.getValue();

//        error
//        Orange orange = (Orange) f.getValue();

//        error
//        f.setValue(new Apple());
//        error
//        f.setValue(new Fruit());

        System.out.println(f.equals(apple));



    }
}
