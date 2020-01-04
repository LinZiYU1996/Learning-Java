package chapter_14.c_14_3.c_14_3_1;

import chapter_14.c_14_3.model.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:11 2020/1/4
 */
public class LiteralPetCreator extends PetCreator {

    // No try block needed.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class,Hamster.class));
    // Types for random creation:
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }
}
