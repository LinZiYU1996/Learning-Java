package chapter_15.lesson.l5;

public interface GenericGetter<T extends GenericGetter<T>> {

    T get();
}
