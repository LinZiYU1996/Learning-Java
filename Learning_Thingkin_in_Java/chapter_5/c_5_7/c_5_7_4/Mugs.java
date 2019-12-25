package chapter_5.c_5_7.c_5_7_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:02 2019/12/25
 */
public class Mugs {

    Mug c1;
    Mug c2;
    {
        c1 = new Mug(1);
        c2 = new Mug(2);
        System.out.println("c1 & c2 initialized");
    }
    Mugs() {
        System.out.println("Mugs()");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Mugs x = new Mugs();
    }

//    它看起来与静态初始化从句极其相似，只是static 关键字从里面消失了。为支持对“匿名内部类”的初始化
//（参见第7 章），必须采用这一语法格式。
}
