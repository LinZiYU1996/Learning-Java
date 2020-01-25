package JDK_8.chapter_5.c_5_5.c_5_5_2;

import JDK_8.chapter_5.c_5_5.Data;
import JDK_8.chapter_5.c_5_5.Transaction;

import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 22:03
 * \* Description:
 * \
 */
public class M7 {

    public static void main(String[] args) {

        List<Transaction> transactions = Data.create();


        Optional<Integer> highestValue =

                transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        System.out.println(highestValue);

    }
}
