package chapter_15.lesson.l3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:41
 * \* Description:
 * \
 */
public class BasicHolder<T> {

    T element;

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    void f(){
        System.out.println(element.getClass().getSimpleName());
    }

}
