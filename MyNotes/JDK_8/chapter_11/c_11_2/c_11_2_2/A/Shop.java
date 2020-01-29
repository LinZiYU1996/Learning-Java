package JDK_8.chapter_11.c_11_2.c_11_2_2.A;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 10:42
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

//supplyAsync 方法接受一个生产者（ Supplier ）作为参数，返回一个 CompletableFuture
//对象，该对象完成异步执行后会读取调用生产者方法的返回值。生产者方法会交由 ForkJoinPool
//池中的某个执行线程（ Executor ）运行，但是你也可以使用 supplyAsync 方法的重载版本，传
//递第二个参数指定不同的执行线程执行生产者方法。一般而言，向 CompletableFuture 的工厂
//方法传递可选参数，指定生产者方法的执行线程是可行的
    public Future<Double> getPriceAsync(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }
}
