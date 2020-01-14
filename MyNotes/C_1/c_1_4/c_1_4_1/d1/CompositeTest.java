package C_1.c_1_4.c_1_4_1.d1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 19:48
 * \* Description:
 * \
 */
class Animal
{
    private void beat()
    {
        System.out.println("心脏跳动...");
    }
    public void breath()
    {
        beat();
        System.out.println("吸气，吐气，呼吸中...");
    }
}
class Bird
{
    // 将原来的父类组合到原来的子类，作为子类的一个组合成分
    private Animal a;
    public Bird(Animal a)
    {
        this.a = a;
    }
    // 重新定义一个自己的breath()方法
    public void breath()
    {
        // 直接复用Animal提供的breath()方法来实现Bird的breath()方法。
        a.breath();
    }
    public void fly()
    {
        System.out.println("天空飞翔...");
    }
}
class Wolf
{
    // 将原来的父类组合到原来的子类，作为子类的一个组合成分
    private Animal a;
    public Wolf(Animal a)
    {
        this.a = a;
    }
    // 重新定义一个自己的breath()方法
    public void breath()
    {
        // 直接复用Animal提供的breath()方法来实现Wolf的breath()方法。
        a.breath();
    }
    public void run()
    {
        System.out.println("陆地奔跑...");
    }
}
public class CompositeTest
{
    public static void main(String[] args)
    {
        // 此时需要显式创建被组合的对象
        Animal a1 = new Animal();
        Bird b = new Bird(a1);
        b.breath();
        b.fly();
        // 此时需要显式创建被组合的对象
        Animal a2 = new Animal();
        Wolf w = new Wolf(a2);
        w.breath();
        w.run();
    }
}

