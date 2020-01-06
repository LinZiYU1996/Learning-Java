package chapter_15.c_15_8.c_15_8_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:33 2020/1/6
 */
public class GenericArray<T> {

    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[])new Object[sz];
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) { return array[index]; }
    // Method that exposes the underlying representation:
    public T[] rep() { return array; }
    public static void main(String[] args) {
        GenericArray<Integer> gai =
                new GenericArray<Integer>(10);
// This causes a ClassCastException:
//! Integer[] ia = gai.rep();
// This is OK:
        Object[] oa = gai.rep();
    }


}
