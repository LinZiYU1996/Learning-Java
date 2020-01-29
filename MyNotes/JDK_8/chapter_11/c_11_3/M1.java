package JDK_8.chapter_11.c_11_3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 10:53
 * \* Description:
 * \
 */
public class M1 {

    static List<Shop> shops = Arrays.asList(
            new Shop("BestPrice"),
            new Shop("LetsSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("BuyItAll")
    );


//    采用顺序查询所有商店的方式实现的 findPrices 方法
    public static List<String> findPrices(String product) {
        return shops.stream()
                .map(shop -> String.format("%s price is %.2f",
                        shop.getShop_name(), shop.getPriceAsync(product)))
                .collect(toList());
    }

//对 findPrices 进行并行操作
    public static List<String> findPrices_1(String product) {
        return shops.parallelStream()
                .map(shop -> String.format("%s price is %.2f",
                        shop.getShop_name(), shop.getPriceAsync(product)))
                .collect(toList());
    }

//使用 CompletableFuture 实现 findPrices 方法
    public List<String> findPrices_2(String product) {
        List<CompletableFuture<String>> priceFutures =
                shops.stream()
                        .map(shop -> CompletableFuture.supplyAsync(
                                () -> shop.getShop_name() + " price is " +
                                        shop.getPriceAsync(product)))
                        .collect(Collectors.toList());
        return priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(toList());
    }

    public static void main(String[] args) {


        long start = System.nanoTime();
        System.out.println(findPrices("myPhone27S"));
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Done in " + duration + " msecs");



    }
}
