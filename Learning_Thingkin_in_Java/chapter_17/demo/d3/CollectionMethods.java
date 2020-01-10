package chapter_17.demo.d3;

import chapter_16.demo.d1.Alpha;
import sun.java2d.pipe.SpanIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 11:00
 * \* Description:
 * \
 */
public class CollectionMethods {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.addAll(Alphats.names(3));

        collection.add("LKLKL");

        collection.add("OPOPOP");

        System.out.println(collection);

        System.out.println("______________________________________");

        Object[] array = collection.toArray();

        String[] strings = collection.toArray(new String[0]);

        System.out.println("Max   ----" + Collections.max(collection));

        System.out.println("______________________________________");


        System.out.println("Min   ----" + Collections.min(collection));

        Collection<String> collection_2 = new ArrayList<>();

        collection_2.addAll(Alphats.names(3));

        collection.addAll(collection_2);

        System.out.println("______________________________________");


        System.out.println(collection);

        System.out.println("______________________________________");

        collection.remove(Alphats.ALPS[0][0]);

        System.out.println(collection);

        System.out.println("______________________________________");

        collection.removeAll(collection_2);

        System.out.println(collection);

        System.out.println("______________________________________");

        String val = Alphats.ALPS[3][0];

        System.out.println("Exist?   " + collection.contains(val));

        System.out.println("______________________________________");

        Collection<String> collection_3 = ((List<String>)collection).subList(1,2);

        System.out.println(collection_3);


    }
}
