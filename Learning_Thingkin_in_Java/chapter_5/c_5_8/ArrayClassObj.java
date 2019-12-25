package chapter_5.c_5_8;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:13 2019/12/25
 */
public class ArrayClassObj {

//    若操作的是一个非基本类型对象的数组，那么无论如何都要使用new。在这里，我们会再一次遇到句柄问
//    题，因为我们创建的是一个句柄数组。请大家观察封装器类型 Integer，它是一个类，而非基本数据类型：

    static Random rand = new Random();
    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main(String[] args) {
        Integer[] a = new Integer[pRand(20)];
        prt("length of a = " + a.length);
        for(int i = 0; i < a.length; i++) {
            a[i] = new Integer(pRand(500));
            prt("a[" + i + "] = " + a[i]);
        }
    }
    static void prt(String s) {
        System.out.println(s);
    }

//    在这儿，甚至在new调用后才开始创建数组：
//    Integer[] a = new Integer[pRand(20)];
//    它只是一个句柄数组，而且除非通过创建一个新的 Integer对象，从而初始化了对象句柄，否则初始化进程
//    不会结束：
//    a[i] = new Integer(pRand(500));
//    但若忘记创建对象，就会在运行期试图读取空数组位置时获得一个“违例”错误。

}
