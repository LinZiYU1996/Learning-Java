package chapter_17.demo.d5;

import chapter_17.c_17_2.c_17_2_3.CountingMapData;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 15:47
 * \* Description:
 * \
 */
public class SortedMapDemo {

    public static void main(String[] args) {


        TreeMap<Integer,String> sortMap =
                new TreeMap<>(new CountingMapData(30));

        System.out.println(sortMap);

        System.out.println("______________________________________________");

        Integer low = sortMap.firstKey();

        Integer high = sortMap.lastKey();

        System.out.println(low);

        System.out.println("______________________________________________");

        System.out.println(high);

        Iterator<Integer> integerIterator = sortMap.keySet().iterator();

        for (int i = 0; i <=6 ; i++) {

            if (i == 3) {
                low = integerIterator.next();
            }

            if (i == 6) {
                high = integerIterator.next();
            }
            else {
                integerIterator.next();
            }
        }

        System.out.println(low);

        System.out.println("______________________________________________");

        System.out.println(high);

        System.out.println(sortMap.subMap(low,high));


    }
}
