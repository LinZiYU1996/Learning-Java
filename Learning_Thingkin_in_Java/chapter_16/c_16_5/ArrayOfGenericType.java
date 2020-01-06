package chapter_16.c_16_5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:12 2020/1/6
 */
public class ArrayOfGenericType<T> {

    T[] array; // OK
    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
//! array = new T[size]; // Illegal
        array = (T[])new Object[size]; // "unchecked" Warning
    }
// Illegal:
//! public <U> U[] makeArray() { return new U[10]; }


}
