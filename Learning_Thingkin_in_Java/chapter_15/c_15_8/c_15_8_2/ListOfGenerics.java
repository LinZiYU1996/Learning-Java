package chapter_15.c_15_8.c_15_8_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:31 2020/1/6
 */
public class ListOfGenerics<T> {

    private List<T> array = new ArrayList<T>();
    public void add(T item) { array.add(item); }
    public T get(int index) { return array.get(index); }


}
