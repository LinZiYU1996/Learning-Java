package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:31 2019/12/25
 */
public class AutoboxingVarargs {


//    但是，可变参数确实与自动装箱协调工作。 例如：
    public static void f(Integer... args) {
        for(Integer i : args)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(4, 5, 6, 7, 8, 9);
        f(10, new Integer(11), 12);
    }
//    请注意，您可以在单个参数列表中将类型混合在一起，然后自动装箱
//    有选择地将int参数提升为Integer。

}
