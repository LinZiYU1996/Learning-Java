package chapter_21.c_21_3.c_21_3_7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 15:43
 * \* Description:
 * \
 */
public class Accessor implements Runnable{


//    线程本地存储

//    为使用相同变量的每个不同的线程都创建不同的存储


    private final int id;
    public Accessor(int idn) { id = idn; }


    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }
    public String toString() {
        return "#" + id + ": " +
                ThreadLocalVariableHolder.get();
    }


}
