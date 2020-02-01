package JDK_8.method_reference.A2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 15:01
 * \* Description:
 * \
 */
public class Test2 {


    public static void main(String[] args) {

        //构造方法引用
        Supplier<List<User>> supplier =
                () ->
                        new ArrayList<>();

        System.out.println(supplier.get());

        System.out.println("----------------");

        Supplier<List<User>> supplier1 = ArrayList::new;

        System.out.println(supplier1.get());

        System.out.println("----------------");

        Supplier<User> supplier2 = User::new;

        System.out.println(supplier2.get());



    }
}
