package JDK_8.Java_8_Function_Programming.chapter_3.A5.a4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 16:54
 * \* Description:
 * \
 */
public class Person_Data {

    static Random random = new Random();

    static String[] sexs = new String[]
            {
              "male",
              "female"
            };

    public static List<Person> people(){

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 15; i++) {

            Person person = new Person();

            person.setAge(random.nextInt(60));

            person.setSex(sexs[random.nextInt(sexs.length)]);

            person.setName(i + "号");

            people.add(person);
        }

        return people;
    }

    public static void main(String[] args) {

        for (Person person : people()){
            System.out.println(person);
        }

    }
}
