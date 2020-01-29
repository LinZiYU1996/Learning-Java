package JDK_8.chapter_14.c_14_3.c_14_3_2;

public interface MyList<T> {

    T head();
    MyList<T> tail();

    default boolean isEmpty() {
        return true;
    }
}
