package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_Example;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:05
 * \* Description:
 * \
 */
public class FilterFindFirstAndForEach {


    //Here we will filter a list of User objects on the basis of some string and then we will find the first element in the list and if we do not get any data then we will return null.


    public static void main(String[] args) {

        List<User> list = User.getUsers();
        System.out.println("Using findFirst() ---");

        User user = list.stream()
                .filter(user1 -> user1.getName().endsWith("sh"))
                .findFirst().orElse(null);

        System.out.println(user.getName());

        System.out.println("Using forEach() ---");

        list.stream()
                .filter(user1 -> user.getName().endsWith("sh"))
                .forEach(System.out::println);



    }

}
