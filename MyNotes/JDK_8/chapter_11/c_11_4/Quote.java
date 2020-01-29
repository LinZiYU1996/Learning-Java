//package JDK_8.chapter_11.c_11_4;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* User: LinZiYu
// * \* Date: 2020/1/28
// * \* Time: 11:12
// * \* Description:
// * \
// */
//public class Quote {
//
//    private final String shopName;
//    private final double price;
//    private final Discount.Code discountCode;
//
//
//    public Quote(String shopName, double price, Discount.Code discountCode) {
//        this.shopName = shopName;
//        this.price = price;
//        this.discountCode = discountCode;
//    }
//
//
////    通过传递 shop 对象返回的字符串给静态工厂方法 parse ，你可以得到 Quote 类的一个实例，
////它包含了 shop 的名称、折扣之前的价格，以及折扣代码
//    public static Quote parse(String s) {
//        String[] split = s.split(":");
//        String shopName = split[0];
//        double price = Double.parseDouble(split[1]);
//        Discount.Code discountCode = Discount.Code.valueOf(split[2]);
//        return new Quote(shopName, price, discountCode);
//    }
//
//    public String getShopName() {
//        return shopName;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public Discount.Code getDiscountCode() {
//        return discountCode;
//    }
//}
