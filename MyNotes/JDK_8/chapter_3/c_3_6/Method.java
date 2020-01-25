package JDK_8.chapter_3.c_3_6;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 13:30
 * \* Description:
 * \
 */
public class Method {


//    Lambda及其等效方法引用的例子

//    Lambda  等效的方法引用
//(Apple a) -> a.getWeight()  Apple::getWeight
//() -> Thread.currentThread().dumpStack()  Thread.currentThread()::dumpStack
//(str, i) -> str.substring(i)  String::substring
//(String s) -> System.out.println(s)  System.out::println


    public static void test(){

    }



    public static void main(String[] args) {

        Apple apple = new Apple("jikasjj",5415664);

        System.out.println(apple.getWeight());

//        System.out.println(apple::getWeight);




    }
}
