package JDK_8.chapter_6.c_6_4.c_6_4_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 11:00
 * \* Description:
 * \
 */
public class Test_6_2 {


    public static void m1(){

        List<Dish> menu = Data.create();


        System.out.println(  menu.stream().collect(partitioningBy(Dish::isVegetarian,
                partitioningBy (d -> d.getCalories() > 500))));




    }


    public static void m2(){

        List<Dish> menu = Data.create();


//        这无法编译，因为 partitioningBy 需要一个谓词，也就是返回一个布尔值的函数。
//方法引用 Dish::getType 不能用作谓词。
//        System.out.println( menu.stream().collect(partitioningBy(Dish::isVegetarian,
//                partitioningBy (Dish::getType))));

    }


    public static void M3(){

        List<Dish> menu = Data.create();

        System.out.println(  menu.stream().collect(partitioningBy(Dish::isVegetarian,
                counting())));


    }



    public static void main(String[] args) {

        m1();



    }
}
