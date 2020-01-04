package chapter_14.c_14_3;

import chapter_14.c_14_3.model.Pet;
import chapter_14.c_14_3.model.PetCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:06 2020/1/4
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "chapter_14.c_14_3.model.Mutt",
            "chapter_14.c_14_3.model.Pug",
            "chapter_14.c_14_3.model.EgyptianMau",
            "chapter_14.c_14_3.model.Manx",
            "chapter_14.c_14_3.model.Cymric", "chapter_14.c_14_3.model.Rat",
            "chapter_14.c_14_3.model.Mouse",
            "chapter_14.c_14_3.model.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
