package JDK_8.myNotes.J_Predicate.common_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 11:19
 * \* Description:
 * \
 */
public class Person {

    private String name;

    private int age;

    private String origin;

    public Person(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", origin='" + origin + '\'' +
                '}';
    }
}
