package JDK_8.functional_interface.Java_Custom_Functional_Interface;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:32
 * \* Description:
 * \
 */
public class Test2 {


    public static void main(String[] args) {

        Calculator calculator = Utility::add;

        System.out.println(
                calculator.calculate(30,50)
        );

    }
}
