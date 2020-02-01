package JDK_8.method_reference.A2;

import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 14:56
 * \* Description:
 * \
 */
public class TestInstanceReference {


    public static void main(String[] args) {

        //实例方法引用，顾名思义就是调用已经存在的实例的方法，与静态方法引用不同的是类要先实例化，静态方法引用类无需实例化，直接用类名去调用


        User user = new User("JJ",55);

        Supplier<String> stringSupplier = ()->user.getName();

        System.out.println(stringSupplier.get());

        System.out.println("-----------");

        Supplier<Integer> ageS = user::getAge;

        System.out.println(ageS.get());

    }
}
