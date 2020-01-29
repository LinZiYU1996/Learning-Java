package JDK_8.chapter_11.c_11_2.c_11_2_2;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 10:39
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


    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
            try {
                double price = calculatePrice(product);

//                如果价格计算正常结//束，完成 Future 操作//并设置商品价格
                futurePrice.complete(price);
            } catch (Exception ex) {
//                否则就抛出导致失//败的异常，完成这//次 Future 操作
                futurePrice.completeExceptionally(ex);
            }
        }).start();
        return futurePrice;
    }

//    客户端现在会收到一个 ExecutionException 异常，该异常接收了一个包含失败原因的
//Exception 参数，即价格计算方法最初抛出的异常

}
