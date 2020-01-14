package C_1.c_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 9:44
 * \* Description:
 * \
 */
public class Person {

    private int age;

    private String name;

//    public Person(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

//    public Person(int age, String name) {
//        age = age;
//        name = name;
//    }

    public Person(int the_age, String the_name) {
        age = the_age;
        name = the_name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Person person = new Person(15,"John");

        System.out.println(person);


    }
}
