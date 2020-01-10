package chapter_17.demo.d4;

import java.util.LinkedList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 22:32
 * \* Description:
 * \
 */
public class Deque<T> {

    private LinkedList<T> deque = new LinkedList<>();

    public void addFirst(T e){
        deque.addFirst(e);
    }

    public void addLast(T e){
        deque.addLast(e);
    }

    public T getFirst(){
        return deque.getFirst();
    }

    public T getLast(){
        return deque.getLast();
    }

    public T removeFirst(){
        return deque.removeFirst();
    }

    public T removeLast(){
        return deque.removeLast();
    }

    public int size(){
        return deque.size();
    }

    @Override
    public String toString() {
        return "Deque{" +
                "deque=" + deque +
                '}';
    }
}
