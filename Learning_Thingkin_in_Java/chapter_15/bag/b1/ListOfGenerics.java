package chapter_15.bag.b1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:22
 * \* Description:
 * \
 */
public class ListOfGenerics<T> {

    private List<T> array = new ArrayList<>();

    public void add(T item){
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }


}
