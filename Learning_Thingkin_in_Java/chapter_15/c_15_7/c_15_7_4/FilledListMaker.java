package chapter_15.c_15_7.c_15_7_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:16 2020/1/6
 */
public class FilledListMaker<T> {

    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for(int i = 0; i < n; i++)
            result.add(t);
        return result;
    }
    public static void main(String[] args) {
        FilledListMaker<String> stringMaker =
                new FilledListMaker<String>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }

//即使编译器无法知道有关create()中的T的任何信息，但是它仍旧可以在编译期确保你放置到result中的
// 对象具有T类型，使其适合ArrayList<T>。因此，即使擦除在方法或类内部移除了 有关实际类型的信息，
// 编译器仍旧可以确保在方法或类中使用的类型的内部一致性。
}
