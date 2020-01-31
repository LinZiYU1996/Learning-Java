package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_Example;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:07
 * \* Description:
 * \
 */
public class FilterMapToIntAndSum {

//Here we will filter our list for a range of given user id and then we will calculate the sum of age of the users.
    public static void main(String[] args) {

        List<User> list = User.getUsers();

        System.out.println("--- Sum of age between the user id 2 and 4 ---");

        int sum = list.stream()
                .filter(user -> user.getId()>=2 && user.getId()<= 4)
                .mapToInt(User::getAge)
                .sum();


        System.out.println(sum);
    }
}
