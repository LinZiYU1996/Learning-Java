package chapter_15.bag.b1.b8;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 10:07
 * \* Description:
 * \
 */
public class GenericWriting {

//    使用了一个确切参数类型（无通配符）
    static <T> void writeExact(List<T> list,T item){
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();

    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1(){
        writeExact(apples,new Apple());
        writeExact(fruits,new Apple());
    }

//    使用了通配符，因此这个List将持有从T导出的某种具体类型
    static <T> void
    writrWithWildcard(List<? super T> list,T item){
        list.add(item);
    }

    static void f2(){
        writrWithWildcard(apples,new Apple());
        writrWithWildcard(fruits,new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }

}
