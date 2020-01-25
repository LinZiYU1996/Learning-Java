package JDK_8.chapter_5.c_5_5.c_5_5_2;

import JDK_8.chapter_5.c_5_5.Data;
import JDK_8.chapter_5.c_5_5.Transaction;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 21:46
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Transaction> transactions = Data.create();

        List<String> cities =

                transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());


        System.out.println(cities);

//        或者

        Set<String> cities_1 =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .collect(toSet());


        System.out.println(cities_1);
    }
}
