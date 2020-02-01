package JDK_8.method_reference.A2;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 14:55
 * \* Description:
 * \
 */
public class User {

    private String name;
    private Integer age;


    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<User> get(){
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            users.add(new User(i+"",i));
        }

        return users;
    }
}
