package book_jvm.P7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 19:51
 * \* Description:
 * \
 */
public class NotInitialization {

    public static void main(String[] args) {


        System.out.println(SubClass.value);


        /*

        子类没有初始化

        对于静态字段  只有直接定义这个字段的类才会被初始化



         */

    }
}
