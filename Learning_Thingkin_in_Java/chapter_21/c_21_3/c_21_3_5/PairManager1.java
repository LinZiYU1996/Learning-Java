package chapter_21.c_21_3.c_21_3_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 15:30
 * \* Description:
 * \
 */
public class PairManager1 extends PairManager{


//    synchronized修饰整个方法
    public synchronized void increment() {
        p.incrementX();
        p.incrementY();
        store(getPair());
    }


}
