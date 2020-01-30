package JDK_8.Java_8_Function_Programming.chapter_3.A3.a1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 22:16
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<User> users = User_Data.create();


//        统计每个地方的人各有多少
        Map<String,Long> c1 = users.stream().collect(
                Collectors.groupingBy(
                        User::getOrigin,Collectors.counting()
                )
        );




        System.out.println(c1);

    }
}
