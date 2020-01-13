package chapter_21.c_21_2.c_21_2_3;

import chapter_21.c_21_2.c_21_2_1.LisstOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:11
 * \* Description:
 * \
 */
public class FixedThreadPool {

//    FixedThreadPool使用了有限的线程集来执行所提交的任务

    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {

            ex.execute(new LisstOff());

        }

        ex.shutdown();


    }
}
