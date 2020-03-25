package jvm.Learn_invokedynamic;

import java.lang.invoke.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/24
 * \* Time: 9:20
 * \* Description:
 * \
 */
public class T1 {


    // javac Circuit.java
// java Circuit


    public static void startRace(Object obj) {
            // aload obj
            // invokedynamic race()

    }

    public static CallSite bootstrap(MethodHandles.Lookup l, String name, MethodType callSiteType) throws Throwable {
        MethodHandle mh = l.findVirtual(Horse_1.class, name, MethodType.methodType(void.class));
        return new ConstantCallSite(mh.asType(callSiteType));
    }
    public static void main(String[] args) {

        startRace(new Horse_1());

    }
}
class Horse_1 {
    public void race() {
        System.out.println("Horse.race()");
    }
}

class Deer {
    public void race() {
        System.out.println("Deer.race()");
    }
}