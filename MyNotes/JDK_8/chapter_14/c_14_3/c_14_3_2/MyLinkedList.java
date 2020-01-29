package JDK_8.chapter_14.c_14_3.c_14_3_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 14:59
 * \* Description:
 * \
 */
public class MyLinkedList<T> implements MyList<T> {

    private final T head;

    private final MyList<T> tail;

    public MyLinkedList(T head, MyList<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public T head() {
        return head;
    }

    @Override
    public MyList<T> tail() {
        return tail;
    }

    public boolean isEmpty(){
        return false;
    }
}
