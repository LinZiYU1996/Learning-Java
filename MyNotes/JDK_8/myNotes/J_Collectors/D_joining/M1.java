package JDK_8.myNotes.J_Collectors.D_joining;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 13:32
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<String> strings = Create_Data.supply_Strings(5,6);

        System.out.println(strings);

        System.out.println("--------------------------------");

        String s1 = strings.stream()
                .collect(Collectors.joining());
        // 把字符串连接起来
        System.out.println(s1);

        /*
         * [uzkCKX, uzkCKXaBrgim, uzkCKXaBrgimheFUll, uzkCKXaBrgimheFUllSJvAml, uzkCKXaBrgimheFUllSJvAmlurqtBC]
         * --------------------------------
         * uzkCKXuzkCKXaBrgimuzkCKXaBrgimheFUlluzkCKXaBrgimheFUllSJvAmluzkCKXaBrgimheFUllSJvAmlurqtBC
         */

    }
}
