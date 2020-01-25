package JDK_8.chapter_5.c_5_5.c_5_5_2;

import JDK_8.chapter_5.c_5_5.Data;
import JDK_8.chapter_5.c_5_5.Transaction;

import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 21:56
 * \* Description:
 * \
 */
public class M4 {

    public static void main(String[] args) {

        List<Transaction> transactions = Data.create();


        String traderStr =

                transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(n1,n2) -> n1 + n2);

        System.out.println(traderStr);

//        请注意，此解决方案效率不高（所有字符串都被反复连接，每次迭代的时候都要建立一个新
//的 String 对象）

        String traderStr_1 =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .collect(joining());

        System.out.println(traderStr_1);


    }
}
