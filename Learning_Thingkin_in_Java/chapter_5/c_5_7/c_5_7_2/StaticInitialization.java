package chapter_5.c_5_7.c_5_7_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:00 2019/12/24
 */
public class StaticInitialization {

//    Bowl 允许我们检查一个类的创建过程，而Table 和 Cupboard 能创建散布于类定义中的Bowl 的 static成
//    员。注意在 static定义之前，Cupboard 先创建了一个非static 的 Bowl b3。


//    static初始化只有在必要的时候才会进行。如果不创建一个 Table 对象，而且永远都不引用Table.b1 或
//    Table.b2，那么 static Bowl b1 和b2 永远都不会创建。然而，只有在创建了第一个Table 对象之后（或者
//    发生了第一次static 访问），它们才会创建。在那以后，static 对象不会重新初始化。

//    初始化的顺序是首先static（如果它们尚未由前一次对象创建过程初始化），接着是非static 对象。
    public static void main(String[] args) {
        System.out.println(
                "Creating new Cupboard() in main");
        new Cupboard();
        System.out.println(
                "Creating new Cupboard() in main");
        new Cupboard();
        t2.f2(1);
        t3.f3(1);
    }
    static Table t2 = new Table();
    static Cupboard t3 = new Cupboard();


}
