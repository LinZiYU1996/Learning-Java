package C_1.c_1_4.c_1_4_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 19:46
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
// 继承Animal，直接复用父类的breath()方法
class Bird extends Animal
{
    public void fly()
    {
        System.out.println("天空飞翔...");
    }
}
// 继承Animal，直接复用父类的breath()方法
class Wolf extends Animal
{
    public void run()
    {
        System.out.println("陆地奔跑...");
    }
}
public class InheritTest {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.breath();
        b.fly();
        Wolf w = new Wolf();
        w.breath();
        w.run();
    }
}
