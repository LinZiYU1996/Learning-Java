package JDK_8.myNotes.J_Stream.D_min.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 16:23
 * \* Description:
 * \
 */
public class Person {

    private static Random random = new Random();
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public static List<Person> supply_S(){
        List<Person> d = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            d.add(new Person(random.nextInt(100)));
        }
        return d;
    }
}
