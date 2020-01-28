package JDK_8.chapter_9.c_9_4.A;

import chapter_19.c_19_11.Outcome;

public interface A {

    default void hello(){
        System.out.println("Hello from A");
    }
}
