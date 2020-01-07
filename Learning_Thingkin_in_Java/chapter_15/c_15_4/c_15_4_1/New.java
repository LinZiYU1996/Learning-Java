package chapter_15.c_15_4.c_15_4_1;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:57 2020/1/5
 */
public class New {


    public static <K,V> Map<K,V> map() {
        return new HashMap<K,V>();
    }


    public static <T> List<T> list() {
        return new ArrayList<T>();
    }


    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }


    public static <T> Queue<T> queue() {return new LinkedList<T>();
    }


    // Examples:
    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        System.out.println(sls);
        List<String> ls = New.list();
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> qs = New.queue();
    }



}
