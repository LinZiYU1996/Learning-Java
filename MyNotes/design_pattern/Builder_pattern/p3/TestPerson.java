package design_pattern.Builder_pattern.p3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 11:12
 * \* Description:
 * \
 */
public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person.Builder("张三","男")
                .age("12")
                .money("1000000")
                .car("宝马")
                .build();


        System.out.println(person);

    }
}
