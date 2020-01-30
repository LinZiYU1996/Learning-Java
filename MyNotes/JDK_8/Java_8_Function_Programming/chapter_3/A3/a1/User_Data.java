package JDK_8.Java_8_Function_Programming.chapter_3.A3.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 21:58
 * \* Description:
 * \
 */
public class User_Data {


    static String[] orgins = new String[]{

            "beijing",
            "shanghai",
            "guangzhou",
            "shenzhen",
            "nanjing"

    };


    static Random random = new Random(55);


    public static List<User> create(){

        List<User> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            String s = String.valueOf(i);
            list.add(new User(s,
                   orgins[random.nextInt(orgins.length)],
                    random.nextInt(100)));

        }

        return list;
    }


    public static void main(String[] args) {

        for (User user:create()){
            System.out.println(user.getAge()+"   " +user.getName() + "   " + user.getOrigin());
        }

    }

}
