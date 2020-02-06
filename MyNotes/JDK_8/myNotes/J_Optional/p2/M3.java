package JDK_8.myNotes.J_Optional.p2;

import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/5
 * \* Time: 21:23
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        // 创建Optional
        String mayBeNull = null;
        Optional<String> opt1 = Optional.of(" Hello, rensanning! ");
        Optional<String> opt2 = Optional.ofNullable(mayBeNull);
        Optional<String> opt3 = Optional.empty();

        // isPresent
        boolean b1 = opt1.isPresent();
        boolean b2 = opt2.isPresent();
        boolean b3 = opt3.isPresent();
        System.out.println(b1 + "\t" + b2 + "\t" + b3); // true	false	false


    }
}
