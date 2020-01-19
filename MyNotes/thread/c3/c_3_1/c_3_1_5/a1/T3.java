package thread.c3.c_3_1.c_3_1_5.a1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 15:59
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {

        AtomicInteger atomicInteger =  new AtomicInteger(0);

        atomicInteger.compareAndSet(0,55);

        System.out.println(atomicInteger.get());


        atomicInteger.compareAndSet(100,212255);

        System.out.println(atomicInteger.get());

    }
}
