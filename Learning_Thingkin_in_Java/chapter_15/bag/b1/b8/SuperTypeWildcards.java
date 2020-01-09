package chapter_15.bag.b1.b8;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Fruit;
import chapter_15.c_15_10.Jonathan;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 10:03
 * \* Description:
 * \
 */
public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> a){
        a.add(new Apple());

        a.add(new Jonathan());

//        error
//        a.add(new Fruit());
    }
}
