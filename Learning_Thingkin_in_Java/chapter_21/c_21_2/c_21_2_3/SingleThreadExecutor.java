package chapter_21.c_21_2.c_21_2_3;

import chapter_21.c_21_2.c_21_2_1.LisstOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:13
 * \* Description:
 * \
 */
public class SingleThreadExecutor {

//    SingleThreadExecutor就像是线程数量为1的FixedThreadPool

    public static void main(String[] args) {

        ExecutorService ex = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {

            ex.execute(new LisstOff());

        }

        ex.shutdown();

    }
}
