package Effective.P14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/10
 * \* Time: 21:25
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("John",18));
        list.add(new Person("Marry",21));
        list.add(new Person("Tom",20));
        System.out.println("Before sort:");
        printList(list);
        Collections.sort(list);
        System.out.println("After sort:");
        printList(list);


    }

    public static void printList(List<Person> list){
        for (Person p : list){
            System.out.print(p + " / ");
        }
        System.out.println();
    }
}
