package chapter_21.c_21_3.c_21_3_6;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 15:40
 * \* Description:
 * \
 */
public class DualSynch {

//    演示两个任务同时进入同一个对象

//   下面两个同步操作是相互独立的


    private Object syncObject = new Object();
    public synchronized void f() {
        for(int i = 0; i < 5; i++) {
            print("f()");
            Thread.yield();
        }
    }
    public void g() {
        synchronized(syncObject) {
            for(int i = 0; i < 5; i++) {
                print("g()");
                Thread.yield();
            }
        }
    }


}
