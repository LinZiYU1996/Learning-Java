package JDK_8.Java_8_Function_Programming.chapter_3.A3.a1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 22:21
 * \* Description:
 * \
 */
public class M2 {


    private static String myM(User user){
        return user.getName()+ "  from  " + user.getOrigin();
    }


    public static void main(String[] args) {

//多个属性拼接出一个组合属性
        List<User> users = User_Data.create();

        Map<String,List<User>> map = users.stream().collect(
                Collectors.groupingBy(
                        e->myM(e)
                )
        );

        for (String s : map.keySet()){
            System.out.println(s);
        }

//        System.out.println(map);

    }
}
