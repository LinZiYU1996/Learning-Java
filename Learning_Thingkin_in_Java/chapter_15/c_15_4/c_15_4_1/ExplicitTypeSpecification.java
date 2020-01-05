package chapter_15.c_15_4.c_15_4_1;

import chapter_11.c_11_5.model.Person;
import chapter_14.c_14_3.model.Pet;

import java.util.List;
import java.util.Map;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:08 2020/1/5
 */
public class ExplicitTypeSpecification {


    static void f(Map<Person, List<Pet>> petPeople) {}
    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }



}
