package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_Example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:08
 * \* Description:
 * \
 */
public class FilterAndCollect {

//Here we are filtering a list and then counting the number of elements.
    public static void main(String[] args) {

        List<User> list = User.getUsers();


        long count = list.stream()
                .filter(user -> user.getName().endsWith("sh"))
                .collect(Collectors.counting());

        System.out.println(count);

    }
}
