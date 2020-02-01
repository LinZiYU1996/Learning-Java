package JDK_8.functional_interface.Java_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:01
 * \* Description:
 * \
 */
public class PredicateStreamDemo1 {


    //Predicate with Stream
    //We will provide examples to use Predicate with Stream. We will filter list using Stream.filter. The syntax of filter() is as following.
    //filter(Predicate predicate) filter() returns the instance of Stream that consists the filtered data after processing given Predicate.


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vijay");
        list.add("Ramesh");
        list.add("Mahesh");

        Predicate<String> predicate = s ->

                s.endsWith("sh");

        list.stream()
                .filter(predicate)
                .forEach(System.out::println);





    }

}
