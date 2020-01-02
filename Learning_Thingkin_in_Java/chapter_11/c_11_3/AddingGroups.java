package chapter_11.c_11_3;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:24 2020/1/2
 */
public class AddingGroups {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        Integer[] moreInts = { 6, 7, 8, 9, 10 };

        collection.addAll(Arrays.asList(moreInts));

// Runs significantly faster, but you can’t
// construct a Collection this way:

        Collections.addAll(collection, 11, 12, 13, 14, 15);

        Collections.addAll(collection, moreInts);

// Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element

//        Exception in thread "main" java.lang.UnsupportedOperationException
// list.add(21); // Runtime error because the
// underlying array cannot be resized.

    }
}
