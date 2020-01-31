package JDK_8.Java_8_Function_Programming.chapter_3.A5;

import JDK_8.Java_8_Function_Programming.chapter_3.A5.a1.User;
import JDK_8.Java_8_Function_Programming.chapter_3.A5.a1.User_Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 14:27
 * \* Description:
 * \
 */
public class M5 {

    public static void main(String[] args) {

        List<User> users = User_Data.create();

        List<String> name = users.stream()
                .map(User::getName)
                .collect(Collectors.toList());



        System.out.println(name);



    }
}
