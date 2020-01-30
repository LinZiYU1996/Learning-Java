package JDK_8.Java_8_Function_Programming.chapter_3.A2.a1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 21:23
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<User> items = Arrays.asList(
                new User("apple", 10, new BigDecimal("9.99")),
                new User("banana", 20, new BigDecimal("19.99")),
                new User("orang", 10, new BigDecimal("29.99")),
                new User("watermelon", 10, new BigDecimal("29.99")),
                new User("papaya", 20, new BigDecimal("9.99")),
                new User("apple", 10, new BigDecimal("9.99")),
                new User("banana", 10, new BigDecimal("19.99")),
                new User("apple", 20, new BigDecimal("9.99"))
        );

//       // 计算名字出现的次数
        Map<String,Long> counting = items.stream().collect(
                Collectors.groupingBy(User::getName,Collectors.counting())
        );


        System.out.println(counting);


//        /       // 计算每个人金额是多少

        Map<String,Integer> sum = items.stream().collect(
                Collectors.groupingBy(User::getName,Collectors.summingInt(User::getPrice))
        );

        System.out.println(sum);


//        /group by Salary
        Map<BigDecimal, List<User>> groupByPriceMap =
                items.stream().collect(Collectors.groupingBy(User::getSalary));

        System.out.println(groupByPriceMap);


        // group by Salary, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(User::getSalary,
                                Collectors.mapping(User::getName, Collectors.toSet())
                        )
                );
        System.out.println(result);

    }
}
