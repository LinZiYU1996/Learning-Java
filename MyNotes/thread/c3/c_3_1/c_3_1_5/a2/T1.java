package thread.c3.c_3_1.c_3_1_5.a2;

import java.util.concurrent.atomic.AtomicReference;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 15:07
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        AtomicReference<Apple> appleAtomicReference = new AtomicReference<>();

        appleAtomicReference.getAndSet(new Apple(" apple 1 "));

        Apple apple = appleAtomicReference.get();

        System.out.println(apple.getName());
        System.out.println("_____________________________________________");

        Apple apple2 = new Apple("apple 2");

        boolean flag = appleAtomicReference.compareAndSet(appleAtomicReference.get(),apple2);

        System.out.println(flag);

        System.out.println(appleAtomicReference.get().getName());

    }
}
