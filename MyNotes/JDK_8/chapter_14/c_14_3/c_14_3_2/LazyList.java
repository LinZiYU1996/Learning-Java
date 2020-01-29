package JDK_8.chapter_14.c_14_3.c_14_3_2;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 15:02
 * \* Description:
 * \
 */
public class LazyList<T> implements MyList<T> {


    final T head;
    final Supplier<MyList<T>> tail;


    public LazyList(T head, Supplier<MyList<T>> tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public T head() {
        return head;
    }

//    注意，与前面的 head 不同，这//里 tail 使用了一个 Supplier//方法提供了延迟性
    @Override
    public MyList<T> tail() {
        return tail.get();
    }


    public boolean isEmpty() {
        return false;
    }

//    public MyList<T> filter(Predicate<T> p) {
//        return isEmpty() ?
//                this :
//                p.test(head()) ?
//                        new LazyList<>(head(), () -> tail().filter(p)) :
//                        tail().filter(p);
//    }

}
