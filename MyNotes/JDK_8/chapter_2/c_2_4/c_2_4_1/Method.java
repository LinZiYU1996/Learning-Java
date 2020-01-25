package JDK_8.chapter_2.c_2_4.c_2_4_1;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;
import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;

import java.util.Comparator;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 10:40
 * \* Description:
 * \
 */
public class Method {


    public static void main(String[] args) {


        List<Apple> apples = CreateDataForApple.create_2();

//        apples.sort(new Comparator<Apple>() {
//            public int compare(Apple a1, Apple a2){
//                return a1.getWeight().compareTo(a2.getWeight());
//            }
//        });

    }
}
