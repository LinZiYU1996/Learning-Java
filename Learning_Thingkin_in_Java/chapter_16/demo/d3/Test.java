package chapter_16.demo.d3;

import chapter_15.c_15_3.Generator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 21:15
 * \* Description:
 * \
 */
public class Test {

    public static int size = 20;

    public static void test(Class<?> surroundingClass){

        for (Class<?> type:surroundingClass.getClasses()){
            System.out.println(type.getSimpleName() + ":");
            try {
                Generator<?> generator = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.println(generator.next() + "");
                }
//                System.out.println("");
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        test(CountingGenerator.class);


    }
}
