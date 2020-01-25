package JDK_8.chapter_5.c_5_5.c_5_5_1;

import JDK_8.chapter_5.c_5_5.Data;
import JDK_8.chapter_5.c_5_5.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 21:18
 * \* Description:
 * \
 */
public class M1 {

//    找出2011年的所有交易并按交易额排序（从低到高）

    public static void main(String[] args) {

        List<Transaction> transactions = Data.create();

        List<Transaction> transactions2011 =

                transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(transactions2011);


    }
}
