package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_map_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:03
 * \* Description:
 * \
 */
public class MapToIntDemo {

//Here we are providing the example of mapToInt() and in the same way we can do for mapToLong() and mapToDouble().
    public static void main(String[] args) {

        Employee e1 = new Employee(1, 20);
        Employee e2 = new Employee(2, 15);
        Employee e3 = new Employee(3, 30);
        List<Employee> list = Arrays.asList(e1, e2, e3);

        int sum = list.stream()
                .mapToInt(e -> e.getAge())
                .sum();

        System.out.println(sum);


    }
}
