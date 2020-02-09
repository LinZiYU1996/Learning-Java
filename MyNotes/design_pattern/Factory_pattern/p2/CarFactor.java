package design_pattern.Factory_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:35
 * \* Description:
 * \
 */
public class CarFactor {

    //一．简单工厂模式
    //
    //　　简单工厂模式就是把对类的创建初始化全都交给一个工厂来执行，而用户不需要去关心创建的过程是什么样的，只用告诉工厂我想要什么就行了。而这种方法的缺点也很明显，违背了设计模式的开闭原则，因为如果你要增加工厂可以初始化的类的时候，你必须对工厂进行改建


    public static Car carFactor(Class<?> c){
        if (c.getName().equals(BMW.class.getName())){
            return new BMW();
        }
        if (c.getName().equals(BYD.class.getName())){
            return new BYD();
        }
        return null;
    }
}
