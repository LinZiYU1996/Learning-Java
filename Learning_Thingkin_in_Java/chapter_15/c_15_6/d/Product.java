package chapter_15.c_15_6.d;

import chapter_15.c_15_3.Generator;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:19 2020/1/5
 */
public class Product {

//    商品id
    private final int id;

//    描述
    private String description;

//    价格
    private double price;

//    构造函数
    public Product(int IDnumber, String descr, double price){
        id = IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }


    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }

//    改变价格的函数
    public void priceChange(double change) {
        price += change;
    }

//    Product生成器
    public static Generator<Product> generator =
            new Generator<Product>() {

                private Random rand = new Random(47);

//                id以及价格都是随机生成
                public Product next() {
                    return new
                            Product(rand.nextInt(1000), "Test",
                            Math.round(rand.nextDouble() * 1000.0) + 0.99);
                }
            };


}
