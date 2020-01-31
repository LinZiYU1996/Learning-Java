package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_Example;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:05
 * \* Description:
 * \
 */
public class User {

    private int id;
    private String name;
    private int age;
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static List<User> getUsers() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "Dinesh", 20));
        list.add(new User(2, "Kamal", 15));
        list.add(new User(3, "Vijay", 25));
        list.add(new User(4, "Ramesh", 30));
        list.add(new User(5, "Mahesh", 18));
        return list;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
