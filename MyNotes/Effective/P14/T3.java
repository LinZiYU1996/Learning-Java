package Effective.P14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/10
 * \* Time: 21:30
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {

        List<Person_3> list = new ArrayList<>();
        list.add(new Person_3(3,"John",18));
        list.add(new Person_3(2,"Marry",21));
        list.add(new Person_3(2,"Tom",20));
        list.add(new Person_3(4,"Mark",20));
        list.add(new Person_3(4,"Ruby",20));
        System.out.println("Before sort:");
        printList(list);
        Collections.sort(list);
        System.out.println("After sort:");
        printList(list);
    }

    public static void printList(List<Person_3> list){
        for (Person_3 p : list){
            System.out.print(p + " / ");
        }
        System.out.println();
    }
}
