package JDK_8.Java_8_Function_Programming.chapter_3.A3.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 21:57
 * \* Description:
 * \
 */
public class User {

    private String name;

    private String origin;

    private int age;

    public User(String name, String origin, int age) {
        this.name = name;
        this.origin = origin;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", age=" + age +
                '}';
    }
}
