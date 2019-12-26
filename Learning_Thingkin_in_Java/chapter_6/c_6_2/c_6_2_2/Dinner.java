package chapter_6.c_6_2.c_6_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:16 2019/12/26
 */
public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        x.bite();
//        这里能用是因为在同一个包下
//! x.bite(); // Can’t access
    }

//    您可以创建一个Cookie对象，因为它的构造函数是公共的，而类是公共的。 （好
//    稍后再看公共类的概念。）但是，bite（）成员是
//    在Dinner.java中无法访问，因为bite（）仅在包数字甜点中提供访问权限，
//    因此编译器会阻止您使用它。

}
