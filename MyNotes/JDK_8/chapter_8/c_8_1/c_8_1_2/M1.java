package JDK_8.chapter_8.c_8_1.c_8_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:05
 * \* Description:
 * \
 */
public class M1 {


//    将实现单一抽象方法的匿名类转换为Lambda//表达式
    public static void main(String[] args) {

        //传统的方式，//使用匿名类

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1");
            }
        };

        runnable1.run();

        System.out.println("========================");


//        新的方式，使用//Lambda表达式
        Runnable runnable2 = () ->
        {
            System.out.println("runnable2");
        };


        runnable2.run();


    }
}
