package chapter_17.demo.d8;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 22:41
 * \* Description:
 * \
 */
public class ListSortSearch {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(Utilities.list);

        list.addAll(Utilities.list);

        System.out.println(list);

        Collections.shuffle(list,new Random(56));

        System.out.println("________________________________________");

        System.out.println("shuffle   " + list);

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {

            listIterator.next();

            listIterator.remove();

        }

        System.out.println("________________________________________");

        System.out.println("Trimed   " + list);

        Collections.sort(list);

        System.out.println("________________________________________");

        System.out.println(list);

        System.out.println("________________________________________");

        String key = list.get(7);

        int index = Collections.binarySearch(list,key);

        System.out.println("LOcation of  " + key + "is   "  + index
        + " . " + list.get(index));

    }
}
