package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_joining_Example;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:15
 * \* Description:
 * \
 */
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static List<Person> getList() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ram", 23));
        list.add(new Person("Shyam", 20));
        list.add(new Person("Shiv", 25));
        list.add(new Person("Mahesh", 30));
        return list;
    }

}
