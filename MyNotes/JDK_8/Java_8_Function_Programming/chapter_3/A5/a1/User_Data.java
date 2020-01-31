package JDK_8.Java_8_Function_Programming.chapter_3.A5.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 14:06
 * \* Description:
 * \
 */
public class User_Data {


    static Random random = new Random(55);

    static String[] names = new String[]
            {

                    "张",
                    "刘",
                    "陈",
                    "王",
                    "许"
            };

    public static List<User> create(){

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 30; i++) {

            users.add(new User(names[random.nextInt(names.length)]+i,random.nextInt(100)));

        }

        return users;

    }
}
