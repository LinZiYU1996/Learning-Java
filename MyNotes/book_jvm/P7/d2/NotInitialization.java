package book_jvm.P7.d2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 19:56
 * \* Description:
 * \
 */
public class NotInitialization {


    public static void main(String[] args) {

        System.out.println(ConstClass.STRING);

        /*

        只是输出了 hello world

        进行了常量传播优化

         */
    }
}
