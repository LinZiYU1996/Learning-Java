package chapter_5.c_5_6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:49 2019/12/24
 */
public class InitialValues {


//    其中，Char 值为空（NULL），没有数据打印出来。
//    稍后大家就会看到：在一个类的内部定义一个对象句柄时，如果不将其初始化成新对象，那个句柄就会获得
//    一个空值。
    public static void main(String[] args) {

        Measurement d = new Measurement();
        d.print();
        /* In this case you could also say:
        new Measurement().print();
        */

    }
}
