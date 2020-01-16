package C_2.c_2_4.c_2_4_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 15:19
 * \* Description:
 * \
 */
public class Test {

    public static void main(String[] args)
            throws Exception
    {
        // 创建一个原始的GunDog对象，作为target
        Dog target = new GunDog();
        // 以指定的target来创建动态代理
        Dog dog = (Dog)MyProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}
