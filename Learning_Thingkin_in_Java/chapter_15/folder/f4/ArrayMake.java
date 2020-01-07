package chapter_15.folder.f4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:49 2020/1/7
 */
public class ArrayMake<T> {

    private Class<T> kind;

    public ArrayMake(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] create(int size){
        return (T[]) Array.newInstance(kind,size);
    }

    public static void main(String[] args) {

        ArrayMake<String> stringArrayMake =
                new ArrayMake<>(String.class);

        String[] strings = stringArrayMake.create(10);

        System.out.println(Arrays.toString(
                strings
        ));

    }

}
