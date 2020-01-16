package C_2.c_2_4.c_2_4_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 16:57
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {

        Person person = new Person("John",15);

        System.out.println(person);


    }
}
