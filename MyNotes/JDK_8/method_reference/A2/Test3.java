package JDK_8.method_reference.A2;

import java.util.List;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 15:06
 * \* Description:
 * \
 */
public class Test3 {


    public static void main(String[] args) {

        Supplier<List<User>> users = User::get;

        System.out.println(users.get());



    }
}
