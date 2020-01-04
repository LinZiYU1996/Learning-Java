package chapter_14.c_14_3.c_14_3_3;

import chapter_14.c_14_3.model.Pet;
import chapter_14.c_14_3.model.Pets;

import static chapter_6.c_6_1.c_6_1_3.Print.print;
import static chapter_6.c_6_1.c_6_1_3.Print.printnb;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:15 2020/1/4
 */
public class PetCount4 {

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }


}
