package JDK_8.myNotes.J_Function.common_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 18:09
 * \* Description:
 * \
 */
public class Shanghai_People {

    private String name;

    private int age;

    public Shanghai_People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Shanghai_People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
