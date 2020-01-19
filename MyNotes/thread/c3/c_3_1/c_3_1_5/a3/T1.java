package thread.c3.c_3_1.c_3_1_5.a3;

import java.util.concurrent.atomic.AtomicReference;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 16:23
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        String initialReference = "initial value referenced";

        AtomicReference<String> atomicStringReference =
                new AtomicReference<String>(initialReference);

        String newReference = "new value referenced";
        boolean exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);
        System.out.println(atomicStringReference.get());
        System.out.println("____________________________________");
        exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);
        System.out.println(atomicStringReference.get());

    }
}
