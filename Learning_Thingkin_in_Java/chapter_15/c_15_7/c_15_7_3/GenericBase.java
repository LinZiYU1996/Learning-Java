package chapter_15.c_15_7.c_15_7_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 23:23 2020/1/5
 */
public class GenericBase<T> {

    private T element;
    public void set(T arg) { arg = element; }
    public T get() { return element; }


}
