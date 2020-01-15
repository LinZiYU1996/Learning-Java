package C_1.c_1_8.c_1_8_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 20:49
 * \* Description:
 * \
 */
public class ArrayToCollection {


//    public static void the_ArrayToCollection(Object[] objects, Collection<Object> collection){
////        for (Object o:objects){
////            collection.add(o);
////        }
////    }


    static <T> void the_ArrayToCollection(T[] a,Collection<T> c){
        for (T t:a){
            c.add(t);
        }
    }

    public static void main(String[] args) {
        String[] strings = {"sdsd","dff"};

        List<String> list = new ArrayList<>();

//        the_ArrayToCollection(strings,list);

    }

}
