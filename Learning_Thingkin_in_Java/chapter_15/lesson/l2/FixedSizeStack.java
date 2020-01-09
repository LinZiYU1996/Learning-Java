package chapter_15.lesson.l2;

import chapter_15.bag.b1.b4.Solid;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:21
 * \* Description:
 * \
 */
public class FixedSizeStack<T> {

    private int index = 0;

    private Object[] storage;

    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item){
        storage[index++] = item;
    }

    public T pop(){
        return (T) storage[--index];
    }



}
