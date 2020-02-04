package JDK_8.myNotes.J_Stream.D_toArray.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 14:43
 * \* Description:
 * \
 */
public class Person {

    static String[] genders = {"male","female"};

    static Random random = new Random();

    private String name;

    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static List<Person> supply_S(){
        List<Person> d = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            d.add(new Person(i+"",genders[random.nextInt(genders.length)]));
        }

        return d;
    }
}
