package JDK_8.myNotes.J_Collectors.D_toMap.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 11:00
 * \* Description:
 * \
 */
public class Person {

    private static String[] addresss =
            {
                    "北京",
                    "上海",
                    "广州",
                    "深圳",
                    "南京"

            };

    private static Random random = new Random();

    private String name;

    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static List<Person> supply_P(){
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            people.add(new Person("A",addresss[random.nextInt(addresss.length)]));
        }

        for (int i = 0; i < 3; i++) {

            people.add(new Person("C",addresss[random.nextInt(addresss.length)]));
        }

        return people;

    }
}
