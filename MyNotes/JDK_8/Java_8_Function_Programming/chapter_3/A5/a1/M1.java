package JDK_8.Java_8_Function_Programming.chapter_3.A5.a1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 14:06
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<User> users = User_Data.create();

        List<String> names =

                users.stream()
                .collect(Collectors.mapping(
                        User::getName,Collectors.toList()
                ));

        //[张0, 许1, 陈2, 王3, 许4, 刘5, 张6, 刘7, 刘8, 陈9, 陈10, 张11,
        // 刘12, 陈13, 许14, 许15, 王16, 许17, 王18, 张19, 刘20, 许21, 刘22,
        // 张23, 张24, 刘25, 陈26, 许27, 刘28, 陈29]
        System.out.println(names);

        System.out.println("---------------------------");
        Map<Integer, List<String>> collect = users.stream().collect(Collectors.groupingBy(User::getAge, Collectors.mapping(item ->{

            //当然你这里也可以构建一个新的对象，进行返回
            return item.getName();
        }, Collectors.toList())));

        //   Map<Integer, List<Object>> collect = users.stream().collect(Collectors.groupingBy(Users::getAge, Collectors.mapping(item ->{ return Arrays.asList(item); }, Collectors.toList())));

        collect.forEach((key, value) -> {
            System.out.println("key :   " + key + "    value :   " + value);
        });

    }
}
