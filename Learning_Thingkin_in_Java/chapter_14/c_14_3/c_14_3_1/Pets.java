package chapter_14.c_14_3.c_14_3_1;

import chapter_14.c_14_3.model.Pet;
import chapter_14.c_14_3.model.PetCreator;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:12 2020/1/4
 */
public class Pets {

    public static final PetCreator creator =
            new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }


}
