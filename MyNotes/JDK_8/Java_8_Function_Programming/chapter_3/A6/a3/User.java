package JDK_8.Java_8_Function_Programming.chapter_3.A6.a3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 20:58
 * \* Description:
 * \
 */
public class User {

    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static List<User> supplier(){

        Random  random = new Random();
        List<User> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(new User(random.nextInt(60)));
        }

        return list;
    }
}
