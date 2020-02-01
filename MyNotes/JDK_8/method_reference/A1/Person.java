package JDK_8.method_reference.A1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 14:30
 * \* Description:
 * \
 */


public class Person {

    static Random random = new Random();

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static int compareByAge(Person a, Person b) {
        return a.age.compareTo(b.age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static List<Person> get(){

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            people.add(
                    new Person(i+"",random.nextInt(100))
            );
        }

        return people;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
