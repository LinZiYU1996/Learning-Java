package JDK_8.myNotes.J_Stream.D_sorted.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 11:49
 * \* Description:
 * \
 */
public class Student {

    private static Random random = new Random();

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Student> supply_S(){
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            list.add(new Student(i+"",random.nextInt(100)));
        }
        return list;
    }
}
