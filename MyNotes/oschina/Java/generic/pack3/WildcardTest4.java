package oschina.Java.generic.pack3;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:39
 * \* Description:
 * \
 */
public class WildcardTest4 {
    /*
    逆变指的是 < ? super Apple> 这种写法，这种写法的特性与 <? extends Apple> 的写法的特性是相反的。
    上面的例子，泛型入参方法不能用了，而逆变的特性是入参可以是任何Apple 的子类，注意是子类，不是基类，因为Apple
    的基类有多种，如果编译器允许传入基类，就会存在风险，但是传入子类就不会有风险，因为子类可以转型为Apple 类，Apple
    类可以算是Apple的基类；


     */
    public static void main(String[] args) {
        List<? super Apple> appleList = new ArrayList<Fruit>();
        List<? super Apple> appleList2 = new ArrayList<Apple>();
        List<? super Apple> appleList3 = new ArrayList<>();
        // 前三种情况都可以，但是这种不可以
//    List<? super Apple> appleList4 = new ArrayList<BigApple>();

        // 不可以
        //appleList3.add(new Orange());
        appleList3.add(new Apple());
        appleList3.add(new BigApple());
        // 虽然字面上是 任何 Apple 的父类，但是Apple父类很多，不能确定类型，所以实际上任何Apple 的父类都不行
        //appleList3.add(new Fruit());

        // 只能Object 接
        Object a = appleList3.get(1);
    }


}

class Fruit {}

class Orange extends Fruit {}

class Apple extends Fruit {}

class BigApple extends Apple implements Runnable {
    @Override
    public void run() {
    }
}

class SmallApple extends Apple {}
