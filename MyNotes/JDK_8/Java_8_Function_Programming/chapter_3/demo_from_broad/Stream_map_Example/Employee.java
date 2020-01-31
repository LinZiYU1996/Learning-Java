package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_map_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:03
 * \* Description:
 * \
 */
public class Employee {

    private int id;
    private int age;
    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
