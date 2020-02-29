package Effective.P3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/29
 * \* Time: 20:52
 * \* Description:
 * \
 */
public class Elvis_2 {


    //公有的成员是个静态工厂方法


    //同样也能被反射机制破坏

    private static final Elvis_2 INSTANCE = new Elvis_2();

    private Elvis_2() {

    }

    public static Elvis_2 getInstance() {
        return INSTANCE;
    }
}
