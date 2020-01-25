package JDK_8.chapter_5.c_5_5.c_5_5_2;

import JDK_8.chapter_5.c_5_5.Data;
import JDK_8.chapter_5.c_5_5.Trader;
import JDK_8.chapter_5.c_5_5.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 21:49
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        List<Transaction> transactions = Data.create();


        List<Trader> traders =

                transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println(traders);



    }
}
