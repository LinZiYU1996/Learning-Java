package chapter_11.c_11_7;

import chapter_11.c_11_5.model.Hamster;
import chapter_11.c_11_5.model.Pet;
import chapter_11.c_11_5.model.Pets;
import chapter_11.c_11_5.model.Rat;

import java.util.LinkedList;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:34 2020/1/2
 */
public class LinkedListFeatures {

    public static void main(String[] args) {
        LinkedList<Pet> pets =
                new LinkedList<Pet>(Pets.arrayList(5));
        print(pets);
// Identical:
        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
// Only differs in empty-list behavior:
        print("pets.peek(): " + pets.peek());
// Identical; remove and return the first element:
        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());
// Only differs in empty-list behavior:
        print("pets.poll(): " + pets.poll());
        print(pets);
        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);
        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);
        pets.add(Pets.randomPet());
        print("After add(): " + pets);
        pets.addLast(new Hamster());
        print("After addLast(): " + pets);
        print("pets.removeLast(): " + pets.removeLast());
    }


}
