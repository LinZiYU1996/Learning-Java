package JDK_8.chapter_2.c_2_3.c_2_3_4;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;
import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:48
 * \* Description:
 * \
 */
public class Method {

//    将 List 类型抽象化



    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e: list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }


//    现在你可以把 filter 方法用在香蕉、桔子、 Integer 或是 String 的列表上了

    public static void main(String[] args) {

        Random random = new Random(52);

        List<Apple> apples = CreateDataForApple.create_2();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            numbers.add(random.nextInt(589));
        }
        List<Apple> redApples =
                filter(apples, (Apple apple) -> "red".equals(apple.getColor()));
        List<Integer> evenNumbers =
                filter(numbers, (Integer i) -> i % 2 == 0);


        System.out.println(redApples);

        System.out.println("==================================================");

        System.out.println(evenNumbers);

    }

}
