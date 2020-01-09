package chapter_16.demo.d3;

import chapter_15.c_15_3.Generator;
import chapter_17.c_17_2.c_17_2_1.CollectionData;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 21:38
 * \* Description:
 * \
 */
public class Generater {

    public static <T> T[] array(T[] a, Generator<T> generator){

        return new CollectionData<T>(generator,a.length).toArray(a);

    }

    public static <T> T[] array(
            Class<T> type,Generator<T> generator,int size
    ){
//        Unchecked cast: 'java.lang.Object' to 'T[]'
        T[] a =
                (T[]) java.lang.reflect.Array.newInstance(type,size);

        return new CollectionData<T>(generator,size).toArray(a);
    }
}
