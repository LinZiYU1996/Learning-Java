package chapter_7.c_7_8.c_7_8_1;

import java.util.Random;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:26 2019/12/26
 */
public class FinalData {

    private static Random rand = new Random(47);


    private String id;


    public FinalData(String id) { this.id = id; }

    // 可以用作编译期常量
    private final int valueOne = 9;


    //    根据惯例，既是static又是final的域，用大写表示
//    可以用作编译期常量
    private static final int VALUE_TWO = 99;

    // 更加典型的对常量的定义方式 用public来进行修饰
    public static final int VALUE_THREE = 39;

    // 不可以用作编译期常量
    private final int i4 = rand.nextInt(20);

    static final int INT_5 = rand.nextInt(20);

    private Value v1 = new Value(11);

    private final Value v2 = new Value(22);

    private static final Value VAL_3 = new Value(33);

    // Arrays:
    private final int[] a = { 1, 2, 3, 4, 5, 6 };

    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }


    public static void main(String[] args) {

        FinalData fd1 = new FinalData("fd1");

//! fd1.valueOne++; // Error: can’t change value

        fd1.v2.i++; // Object isn’t constant!

        fd1.v1 = new Value(9); // OK -- not final

        for(int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++; // Object isn’t constant!
//! fd1.v2 = new Value(0); // Error: Can’t
//! fd1.VAL_3 = new Value(1); // change reference
//! fd1.a = new int[3];

        print(fd1);

        print("Creating new FinalData");

        FinalData fd2 = new FinalData("fd2");

        print(fd1);

        print(fd2);
    }


//    不能因为某数据时final就认为是在编译时就可以知道它的值
//    在运行时使用随机生成的数值来初始化i4和INT_5就说明了这一点

//    在fd1和fd2中，i4的值是惟一的，但INT_5的值是不可以通过创建第二个对象来加以改变的，
//    这是因为它是static的，在转载时就已经初始化了。

}
