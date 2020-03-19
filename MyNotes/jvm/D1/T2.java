package jvm.D1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/18
 * \* Time: 20:06
 * \* Description:
 * \
 */
public class T2 {

    public void m(Object o,Integer integer){
        System.out.println("m1");
    }

    public void m(String s,Integer integer) {
        System.out.println("m2");
    }

/*
当传入 null 时，它既可以匹配第一个方法中声明为 Object 的形式参数，也可以匹配第二个方法中声明为 String 的形式参数。由于 String 是 Object 的子类，因此 Java 编译器会认为第二个方法更为贴切。
 */
    public static void main(String[] args) {

        T2 t2 = new T2();

        t2.m(null,1);

        // m2

    }
}
