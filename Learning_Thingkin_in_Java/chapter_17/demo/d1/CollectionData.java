package chapter_17.demo.d1;

import chapter_15.c_15_3.Generator;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 9:45
 * \* Description:
 * \
 */
public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> generator,int quantity){

        for (int i = 0; i < quantity; i++) {
            add(generator.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> generator,int quantity){
        return new CollectionData<T>(generator,quantity);
    }
}
