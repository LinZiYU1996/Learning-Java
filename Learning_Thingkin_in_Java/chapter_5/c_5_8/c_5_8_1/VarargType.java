package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:29 2019/12/25
 */
public class VarargType {

//    以下示例还显示vararg列表变为
//    数组，如果列表中没有任何内容，则为零数组：
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    public static void main(String[] args) {

        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }

//    getClass（）方法是Object的一部分，将在Type中进行全面探讨。
//    信息章节。 它产生一个对象的类，当您打印该类时，您会看到
//    表示类类型的编码字符串。 前导“ [”表示这是一个由
//    随后的类型。 “ I”表示原始整数； 仔细检查，我创建了一个int数组
//    在最后一行并打印其类型。 这验证了使用varargs不依赖于
//    自动装箱，但实际上使用了原始类型。
}
