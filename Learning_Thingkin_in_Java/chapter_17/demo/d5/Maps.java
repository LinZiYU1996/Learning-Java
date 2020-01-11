package chapter_17.demo.d5;

import chapter_17.c_17_2.c_17_2_3.CountingMapData;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 15:39
 * \* Description:
 * \
 */
public class Maps {

    public static void printKeys(Map<Integer,String> map){
        System.out.println("Size =  " + map.size() + ".  ");

        System.out.println("Keys :   ");

        System.out.println(map.keySet());
    }

    public static void test(Map<Integer,String> map){

        System.out.println(map.getClass().getSimpleName());

        map.putAll(new CountingMapData(20));

        printKeys(map);

        System.out.println("________________");

        System.out.println(map.values());

        System.out.println("________________");

        System.out.println(map.containsKey(11));

        System.out.println("________________");

        System.out.println(map.containsValue(12));

        System.out.println("________________");

        Integer key = map.keySet().iterator().next();
    }

    public static void main(String[] args) {

        test(new HashMap<Integer,String>());


    }
}
