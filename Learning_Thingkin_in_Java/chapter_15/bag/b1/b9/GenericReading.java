package chapter_15.bag.b1.b9;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Fruit;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 10:16
 * \* Description:
 * \
 */
public class GenericReading {

//    使用了精确的类型
    static <T> T readExact(List<T> list){
        return list.get(0);
    }

    static List<Apple> apples = Arrays.asList(new Apple());

    static List<Fruit> fruits = Arrays.asList(new Fruit());

    static void f1(){
        Apple a = readExact(apples);

        Fruit f = readExact(fruits);

        f = readExact(apples);
    }

    static class Reader<T> {
        T readExact(List<T> list){
            return list.get(0);
        }
    }

    static void f2(){
        Reader<Fruit> fruitReader = new Reader<>();

        Fruit f = fruitReader.readExact(fruits);

//        error
//        Fruit f1 = fruitReader.readExact(apples);


    }


    static class CovariantReader<T>{
        T readCov(List<? extends T> list){
            return list.get(0);
        }
    }

    static void f3(){
        CovariantReader<Fruit> fruitCovariantReader =
                new CovariantReader<>();

        Fruit fruit = fruitCovariantReader.readCov(fruits);

        Fruit fruit1 = fruitCovariantReader.readCov(apples);
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}
