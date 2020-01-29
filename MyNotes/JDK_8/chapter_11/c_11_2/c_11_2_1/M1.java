package JDK_8.chapter_11.c_11_2.c_11_2_1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 10:31
 * \* Description:
 * \
 */
public class M1 {


    public static void doSomethingElse(){}

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Shop shop = new Shop();

        long s = System.nanoTime();

        Future<Double> future = shop.getPriceAsync("my");


        long invocationTime = ((System.nanoTime() - s) / 1_000_000);

        System.out.println("Invocation returned after " + invocationTime
                + " msecs");


        doSomethingElse();

        double price = future.get();

        System.out.printf("Price is %.2f%n", price);

        long retrievalTime = ((System.nanoTime() - s) / 1_000_000);

        System.out.println("Price returned after " + retrievalTime + " msecs");

    }
}
