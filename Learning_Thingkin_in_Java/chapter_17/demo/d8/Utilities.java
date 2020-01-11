package chapter_17.demo.d8;

import java.util.*;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 20:42
 * \* Description:
 * \
 */
public class Utilities {

    static List<String> list = Arrays.asList(
            "one Two three Four five six one".split(" "));


    public static void main(String[] args) {

        print(list);

        System.out.println("__________________________________________________");

        print("‘list’ disjoint (Four)?: " +
                Collections.disjoint(list,
                        Collections.singletonList("Four")));

        System.out.println("__________________________________________________");

        print("max: " + Collections.max(list));

        System.out.println("__________________________________________________");

        print("min: " + Collections.min(list));

        System.out.println("__________________________________________________");

        print("max w/ comparator: " + Collections.max(list,
                String.CASE_INSENSITIVE_ORDER));

        System.out.println("__________________________________________________");

        print("min w/ comparator: " + Collections.min(list,
                String.CASE_INSENSITIVE_ORDER));

        System.out.println("__________________________________________________");

        List<String> sublist =
                Arrays.asList("Four five six".split(" "));


        print("indexOfSubList: " +
                Collections.indexOfSubList(list, sublist));

        System.out.println("__________________________________________________");

        print("lastIndexOfSubList: " +
                Collections.lastIndexOfSubList(list, sublist));

        System.out.println("__________________________________________________");


        Collections.replaceAll(list, "one", "Yo");

        print("replaceAll: " + list);

        System.out.println("__________________________________________________");


        Collections.reverse(list);


        print("reverse: " + list);

        System.out.println("__________________________________________________");

        Collections.rotate(list, 3);


        print("rotate: " + list);

        System.out.println("__________________________________________________");

        List<String> source =
                Arrays.asList("in the matrix".split(" "));

        Collections.copy(list, source);

        print("copy: " + list);

        System.out.println("__________________________________________________");

        Collections.swap(list, 0, list.size() - 1);


        print("swap: " + list);

        System.out.println("__________________________________________________");

        Collections.shuffle(list, new Random(47));


        print("shuffled: " + list);

        System.out.println("__________________________________________________");

        Collections.fill(list, "pop");

        System.out.println("__________________________________________________");

        print("fill: " + list);

        System.out.println("__________________________________________________");

        print("frequency of ‘pop’: " +
                Collections.frequency(list, "pop"));

        System.out.println("__________________________________________________");

        List<String> dups = Collections.nCopies(3, "snap");

        System.out.println("__________________________________________________");

        print("dups: " + dups);

        System.out.println("__________________________________________________");

        print("‘list’ disjoint ‘dups’?: " +
                Collections.disjoint(list, dups));

        System.out.println("__________________________________________________");
// Getting an old-style Enumeration:
        Enumeration<String> e = Collections.enumeration(dups);
        Vector<String> v = new Vector<String>();
        while(e.hasMoreElements())
            v.addElement(e.nextElement());
// Converting an old-style Vector
// to a List via an Enumeration:
        ArrayList<String> arrayList =
                Collections.list(v.elements());
        print("arrayList: " + arrayList);
    }


}
