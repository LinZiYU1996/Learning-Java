package chapter_21.c_21_3.c_21_3_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 15:30
 * \* Description:
 * \
 */
public class PairManager2 extends PairManager{


//    synchronized修饰代码块
    public void increment() {
        Pair temp;
        synchronized(this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}
