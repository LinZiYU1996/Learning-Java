package JDK_8.myNotes.J_Optional.p2;

import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 20:59
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> op1 = Optional.ofNullable(null);

//        System.out.println(op1.get());
        /*
        Exception in thread "main" java.util.NoSuchElementException: No value present
         */

        Optional<String> op2 = Optional.of("hello");

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
//        Optional<String> op3 = Optional.of(null);

        System.out.println(op2.get());

        // 返回一个空的Optional

        Optional<Integer> op4 = Optional.empty();

        System.out.println(op4.get());
        /*
        Exception in thread "main" java.util.NoSuchElementException: No value present
         */

    }
}
