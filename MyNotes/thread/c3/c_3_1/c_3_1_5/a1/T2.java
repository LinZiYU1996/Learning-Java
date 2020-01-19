package thread.c3.c_3_1.c_3_1_5.a1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 15:00
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(0);

        System.out.println(atomicInteger.get());

        System.out.println("_____________________________________________");

        atomicInteger.addAndGet(100);

        System.out.println(atomicInteger.get());

        System.out.println("_____________________________________________");

        atomicInteger.getAndIncrement();

        System.out.println(atomicInteger.get());

        System.out.println("_____________________________________________");

        atomicInteger.getAndSet(500);

        System.out.println(atomicInteger.get());

        System.out.println("_____________________________________________");

    }
}
