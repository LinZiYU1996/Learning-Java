package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_Example;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:09
 * \* Description:
 * \
 */
public class FilterAndReduce {

//We will calculate the sum of age of users whose name are matching to a given string.
    public static void main(String[] args) {

        List<User> list = User.getUsers();


        list.stream()
                .filter(user -> user.getName().endsWith("sh"))
                .mapToInt(User::getAge)
                .reduce((a,b) -> a + b)
                .ifPresent(
                        s ->
                                System.out.println(("Sum of age of users ending name with 'sh': "+ s)
                ));

    }
}
