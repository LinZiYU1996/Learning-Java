package JDK_8.functional_interface.Java_Custom_Functional_Interface;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:35
 * \* Description:
 * \
 */
public class Test4 {

    public static void main(String[] args) {

        Worship worship = name ->
                System.out.println(name);

        worship.again(worship).again(worship).chant("Jakc");

        Worship worship_2 = (name) -> {
            System.out.println(name);
            System.out.println(name);
        };

        worship_2.again(worship_2).again(worship_2).chant("Ram");

    }
}
