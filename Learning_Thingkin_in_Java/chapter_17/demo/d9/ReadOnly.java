package chapter_17.demo.d9;

import chapter_17.demo.d3.Alphats;

import java.util.*;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 10:27
 * \* Description:
 * \
 */
public class ReadOnly {

    static Collection<String> data =
            new ArrayList<>(Alphats.names());

    public static void main(String[] args) {

        Collection<String> collection =
                Collections.unmodifiableCollection(new ArrayList<>(data)
                );

        System.out.println(collection);

        System.out.println("___________________________");

//        java.lang.UnsupportedOperationException
//        collection.add("s");

        List<String> a = Collections.unmodifiableList(new ArrayList<>(data));

        ListIterator<String> listIterator = a.listIterator();

        System.out.println(listIterator.nextIndex());

        Set<String> s = Collections.unmodifiableSet(
                new HashSet<String>(data));
        print(s); // Reading is OK
//! s.add("one"); // Can’t change it
// For a SortedSet:
//        Set<String> ss = Collections.unmodifiableSortedSet(
//                new TreeSet<String>(data));
//        Map<String,String> m = Collections.unmodifiableMap(
//                new HashMap<String,String>(data);
//        print(m); // Reading is OK
////! m.put("Ralph", "Howdy!");
//// For a SortedMap:
//        Map<String,String> sm =
//                Collections.unmodifiableSortedMap(
//                        new TreeMap<String,String>(Alphats.names(3));



    }
}
