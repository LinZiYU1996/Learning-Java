package chapter_21.c_21_2.c_21_2_8;

import java.util.concurrent.ThreadFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 9:57
 * \* Description:
 * \
 */
public class DaemonThreadFactory implements ThreadFactory {


    @Override
    public Thread newThread(Runnable r) {
        Thread t = newThread(r);

        t.setDaemon(true);

        return t;
    }
}
