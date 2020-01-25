package JDK_8.chapter_5.c_5_5.c_5_5_2;

import JDK_8.chapter_5.c_5_5.Data;
import JDK_8.chapter_5.c_5_5.Transaction;

import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 22:04
 * \* Description:
 * \
 */
public class M8 {


    public static void main(String[] args) {

        List<Transaction> transactions = Data.create();


        Optional<Transaction> smallestTransaction =

                transactions.stream()
                .reduce((t1,t2) ->
                        t1.getValue() < t2.getValue() ? t1 : t2);


//        流支持 min 和 max 方法，它们可以接受一个 Comparator 作为参数，指定
//计算最小或最大值时要比较哪个键值：


        Optional<Transaction> smallestTransaction_1 =
                transactions.stream()
                        .min(comparing(Transaction::getValue));


    }
}
