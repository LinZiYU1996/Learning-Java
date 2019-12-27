package chapter_7.c_7_9.c_7_9_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:38 2019/12/26
 */
public class Beetle extends Insect{



    private int k = printInit("Beetle.k initialized");


    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }


    private static int x2 =
            printInit("static Beetle.x2 initialized");


    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
//    运行程序时，所发生的第一件事就是试图访问Beetle.main方法，于是加载器开始启动并找出Beetle
//    类的编译代码，在对它进行加载过程中，编译器注意到它有一个基类，于是它继续进行加载，不管你是否
//    打算产生一个该基类的对象，这都要发生。
//    根基类中的static初始化（即Insect）被执行，然后是下一个导出类，以此类推。
}
