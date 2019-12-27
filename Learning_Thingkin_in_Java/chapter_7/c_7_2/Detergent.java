package chapter_7.c_7_2;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:12 2019/12/26
 */
public class Detergent extends Cleanser{

//    在Cleaner中有一组方法：append(),dilute(),apply(),scrub(),toString()
//    因为Detergent从Cleanser继承而来，所以它可以自动获得这些方法，
//    尽管并不能看到这些方法在Detergent中的显示定义


    // 使用基类中定义的方法以及对它进行修改是可行的
    public void scrub() {
        append(" Detergent.scrub()");

//        不能直接调用scrub方法，因为这样做会产生递归
//        Java用super关键字来表示超类的意思
        super.scrub(); // 调用原来基类的方法
    }

//  在继承过程中，不一定非得使用基类的方法，也可以在导出类中添加新的方法
    public void foam() { append(" foam()"); }


    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        System.out.println("-------------------------");
        Cleanser.main(args);
    }
}
