package chapter_11.c_11_10;

import chapter_11.c_11_5.model.Cat;
import chapter_11.c_11_5.model.Dog;
import chapter_11.c_11_5.model.Hamster;
import chapter_11.c_11_5.model.Pet;

import java.util.HashMap;
import java.util.Map;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:45 2020/1/2
 */
public class PetMap {

    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String,Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }


}
