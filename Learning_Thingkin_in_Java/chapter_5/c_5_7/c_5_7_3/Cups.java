package chapter_5.c_5_7.c_5_7_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:59 2019/12/25
 */
public class Cups {

    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }

//    在标记为(1)的行内访问 static 对象c1 的时候，或在行(1)标记为注释，同时(2)行不标记成注释的时候，用
//    于Cups 的 static初始化模块就会运行。若(1)和(2)都被标记成注释，则用于 Cups 的static 初始化进程永
//    远不会发生。


}
