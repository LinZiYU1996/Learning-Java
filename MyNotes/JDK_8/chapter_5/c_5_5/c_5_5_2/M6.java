package JDK_8.chapter_5.c_5_5.c_5_5_2;

import JDK_8.chapter_5.c_5_5.Data;
import JDK_8.chapter_5.c_5_5.Transaction;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 22:01
 * \* Description:
 * \
 */
public class M6 {

    public static void main(String[] args) {

        List<Transaction> transactions = Data.create();

        transactions.stream()
                .filter(transaction -> transaction.getTrader()
                .getCity().equals("Cambridge"))
                .forEach(System.out::println);



    }
}
