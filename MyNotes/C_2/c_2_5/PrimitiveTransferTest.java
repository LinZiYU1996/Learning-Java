package C_2.c_2_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 17:08
 * \* Description:
 * \
 */
public class PrimitiveTransferTest {

    public static void swap(int a , int b)
    {
        // 下面三行代码实现a、b变量的值交换。
        // 定义一个临时变量来保存a变量的值
        int tmp = a;
        // 把b的值赋给a
        a = b;
        // 把临时变量tmp的值赋给b
        b = tmp;
        System.out.println("swap方法里，a的值是"
                + a + "；b的值是" + b);
    }
    public static void main(String[] args)
    {
        int a = 6;
        int b = 9;
        swap(a , b);
        System.out.println("交换结束后，变量a的值是"
                + a + "；变量b的值是" + b);
    }


}
