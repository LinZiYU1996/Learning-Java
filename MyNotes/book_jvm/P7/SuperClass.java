package book_jvm.P7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 19:50
 * \* Description:
 * \
 */
public class SuperClass {


    /*
    通过子类引用父类的静态字段  不会导致子类初始化
     */


    static {
        System.out.println("superclass init");
    }

    public static int value = 123;
}
