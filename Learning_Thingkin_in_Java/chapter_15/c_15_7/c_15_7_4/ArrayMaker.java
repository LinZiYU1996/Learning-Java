package chapter_15.c_15_7.c_15_7_4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:36 2020/1/6
 */
public class ArrayMaker<T> {

    private Class<T> kind;

    public ArrayMaker(Class<T> kind) { this.kind = kind; }

    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }


    public static void main(String[] args) {
        ArrayMaker<String> stringMaker =
                new ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }

//    即使kind被存储为Class<f>, 擦除也意味若它实际将被存储为Class,
//    没有任何参数。 因此，当你在使用它时，例如在创建数组时，
//    Array.newlnstanceO实际上并未拥有kind所蕴含的类型倌
}
