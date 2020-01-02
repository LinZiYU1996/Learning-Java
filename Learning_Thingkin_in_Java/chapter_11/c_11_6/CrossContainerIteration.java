package chapter_11.c_11_6;

import chapter_11.c_11_5.model.Pet;
import chapter_11.c_11_5.model.Pets;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:13 2020/1/2
 */
public class CrossContainerIteration {

    public static void display(Iterator<Pet> it) {
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
//        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
//        display(petsTS.iterator());
    }


}
