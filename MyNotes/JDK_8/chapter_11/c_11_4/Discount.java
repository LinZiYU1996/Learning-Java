//package JDK_8.chapter_11.c_11_4;
//
//import java.util.Random;
//
//import static java.lang.String.format;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* User: LinZiYu
// * \* Date: 2020/1/28
// * \* Time: 11:10
// * \* Description:
// * \
// */
//public class Discount {
//
//    Random random = new Random(55);
//
//    //    模拟1秒钟延迟的方法
//    public static void delay() {
//        try {
//            Thread.sleep(1000L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
////    以枚举类型定义的折扣代码
//    public enum Code {
//        NONE(0), SILVER(5), GOLD(10), PLATINUM(15), DIAMOND(20);
//        private final int percentage;
//        Code(int percentage) {
//            this.percentage = percentage;
//        }
//    }
//
//    public String getPrice(String product) {
//        double price = calculatePrice(product);
//
//        Discount.Code code = Discount.Code.values()[
//                random.nextInt(Discount.Code.values().length)]
//                ;
//
//        return format("%s:%.2f:%s", name, price, code);
//    }
//    private double calculatePrice(String product) {
//        delay();
//        return random.nextDouble() * product.charAt(0) + product.charAt(1);
//    }
//
//
//    public static String applyDiscount(Quote quote) {
//        return quote.getShopName() + " price is " +
//                Discount.apply(quote.getPrice(),
//                        quote.getDiscountCode());
//    }
//    private static String apply(double price, Code code) {
////        delay();
////        return format(price * (100 - code.percentage) / 100);
//    }
//
//
//
//}
