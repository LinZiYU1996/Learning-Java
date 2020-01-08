package chapter_15.bag.b1.b7;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 22:05
 * \* Description:
 * \
 */
public class GenericsAndCovariance {

    public static void main(String[] args) {


        List<? extends Fruit> fruits = new ArrayList<Apple>();

//        error
//        fruits.add(new Apple())

//        error
//        fruits.add(new Fruit())

        fruits.add(null);

        Fruit fruit = fruits.get(0);

        System.out.println(fruit);


    }
}
