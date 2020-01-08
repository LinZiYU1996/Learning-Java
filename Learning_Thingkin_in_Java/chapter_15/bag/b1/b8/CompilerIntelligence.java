package chapter_15.bag.b1.b8;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Fruit;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 22:11
 * \* Description:
 * \
 */
public class CompilerIntelligence {

    public static void main(String[] args) {

        List<? extends Fruit> fruits = Arrays.asList(new Apple());

        Apple apple = (Apple) fruits.get(0);

        fruits.contains(new Apple());

        fruits.indexOf(new Apple());



    }
}
