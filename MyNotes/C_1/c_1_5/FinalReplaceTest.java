package C_1.c_1_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 20:42
 * \* Description:
 * \
 */
public class FinalReplaceTest {


    public static void main(String[] args)
    {
        // 下面定义了4个final“宏变量”
        final int a = 5 + 2;
        final double b = 1.2 / 3;
        final String str = "leran" + "Java";
        final String book = "Java" + 99.0;
        // 下面的book2变量的值因为调用了方法，所以无法在编译时被确定下来
        final String book2 = "Java" + String.valueOf(99.0);  //①
        System.out.println(book == "Java99.0");
        System.out.println(book2 == "Java99.0");
    }


}
