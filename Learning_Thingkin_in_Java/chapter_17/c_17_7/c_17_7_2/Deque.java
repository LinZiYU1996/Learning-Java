package chapter_17.c_17_7.c_17_7_2;

import java.util.LinkedList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:56 2020/1/6
 */
public class Deque<T> {

    private LinkedList<T> deque = new LinkedList<T>();
    public void addFirst(T e) { deque.addFirst(e); }
    public void addLast(T e) { deque.addLast(e); }
    public T getFirst() { return deque.getFirst(); }
    public T getLast() { return deque.getLast(); }
    public T removeFirst() { return deque.removeFirst(); }
    public T removeLast() { return deque.removeLast(); }
    public int size() { return deque.size(); }
    public String toString() { return deque.toString(); }
// And other methods as necessary...


}
