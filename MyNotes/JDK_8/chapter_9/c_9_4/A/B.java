package JDK_8.chapter_9.c_9_4.A;

public interface B extends A{
    default void hello(){
        System.out.println("Hello from B");
    }
}
