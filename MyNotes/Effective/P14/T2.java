package Effective.P14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/10
 * \* Time: 21:27
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) {

        List<Person_> list = new ArrayList<>();
        list.add(new Person_("John",18));
        list.add(new Person_("Marry",21));
        list.add(new Person_("Tom",20));
        list.add(new Person_("Mark",20));
        list.add(new Person_("Ruby",20));
        System.out.println("Before sort:");
        printList(list);
        Collections.sort(list);
        System.out.println("After sort:");
        printList(list);
    }

    public static void printList(List<Person_> list){
        for (Person_ p : list){
            System.out.print(p + " / ");
        }
        System.out.println();
    }

}
