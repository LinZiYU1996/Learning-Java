package chapter_5.c_5_4.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:51 2019/12/25
 */
public class A5 {

    void m(){

        System.out.println(this);//prints same reference ID

    }

//    证明这个关键字
//
//    让我们证明这个关键字引用了当前的类实例变量。在这个程序中，我们打印引用变量，这两个变量的输出是相同的。

    public static void main(String args[]){

        A5 obj=new A5();

        System.out.println(obj);//prints the reference ID

        obj.m();

    }
}
