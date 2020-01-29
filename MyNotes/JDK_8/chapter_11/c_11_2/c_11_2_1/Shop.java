package JDK_8.chapter_11.c_11_2.c_11_2_1;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 10:28
 * \* Description:
 * \
 */
public class Shop {

    Random random = new Random(55);

    //    模拟1秒钟延迟的方法
    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }


    public Future<Double> getPriceAsync(String product){

//        创建 CompletableFuture//对象，它会包含计算的结果
        CompletableFuture<Double> future = new CompletableFuture<>();

        new Thread(()->
        {
            double price = calculatePrice(product);

//            需长时间计算的任务结//束并得出结果时，设置//Future 的返回值
            future.complete(price);
        }).start();

//        无需等待还没结束的计//算，直接返回 Future 对象
        return future;

    }
}
