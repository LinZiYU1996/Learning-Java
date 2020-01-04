package chapter_14.c_14_3.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:15 2020/1/2
 */
public abstract class PetCreator {

    private Random random = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet(){

        int n = random.nextInt(types().size());

        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size){

        Pet[] result = new Pet[size];

        for (int i = 0; i < size ; i++) {
            result[i] = randomPet();
        }

        return result;
    }


    public ArrayList<Pet> arrayList(int size){

        ArrayList<Pet> result = new ArrayList<>();

        Collections.addAll(result,createArray(size));

        return result;
    }
}
