package JDK_8.functional_interface.Java_Custom_Functional_Interface;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:31
 * \* Description:
 * \
 */
public class Utility {

    public static long add(long num1, long num2) {
        return num1 + num2;
    }
    public static long multiply(long num1, long num2) {
        return num1 * num2;
    }


    public Utility(String taskName) {
        System.out.println(taskName);
    }



}
