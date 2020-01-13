package chapter_21.c_21_2.c_21_2_2;

import chapter_21.c_21_2.c_21_2_1.LisstOff;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:04
 * \* Description:
 * \
 */
public class MoreBasicThreads {


//    可以看看所有任务是怎样相互呼应的

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            new Thread(new LisstOff()).start();

        }

        System.out.println("Waiting....");

    }
}
