package JDK_8.functional_interface.Java_Custom_Functional_Interface;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:34
 * \* Description:
 * \
 */
public class Test3 {

    public static void main(String[] args) {

        TaskHandler handler = Utility::new;

        handler.get("hello");

    }
}
