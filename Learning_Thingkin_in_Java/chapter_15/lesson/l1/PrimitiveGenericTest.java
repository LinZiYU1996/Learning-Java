package chapter_15.lesson.l1;

import chapter_16.c_16_6.c_16_6_2.RandomGenerator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:06
 * \* Description:
 * \
 */
public class PrimitiveGenericTest {

    public static void main(String[] args) {


        String[] strings = FArray.fill(
                new String[7],new RandomGenerator.String(10)
        );

        for (String s:strings){
            System.out.println(s);
        }

        Integer[] integers = FArray.fill(
                new Integer[7],new RandomGenerator.Integer()
        );

        for(int i:integers){
            System.out.println(i);
        }

//        自动装箱在这里不会起作用了
//        int[] b = FArray.fill(new int[7],new RandomGenerator());


    }
}
