package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 17:13
 * \* Description:
 * \
 */
public class ProductFactory {


//    创建一个工厂类，它包含一个负责实现不同对象的方法
    public static Product createProduct(String name){
        switch(name){
            case "loan": return new Loan();
            case "stock": return new Stock();
            case "bond": return new Bond();
            default: throw new RuntimeException("No such product " + name);
        }
    }

//这里贷款（ Loan ）、股票（ Stock ）和债券（ Bond ）都是产品（ Product ）的子类。
//createProduct 方法可以通过附加的逻辑来设置每个创建的产品。但是带来的好处也显而易
//见，你在创建对象时不用再担心会将构造函数或者配置暴露给客户


}
