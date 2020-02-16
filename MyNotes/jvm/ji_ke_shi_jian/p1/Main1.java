package jvm.ji_ke_shi_jian.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/16
 * \* Time: 16:39
 * \* Description:
 * \
 */
public class Main1 {

    public static void m1(Object o1,Object...args){
        System.out.println("m1 _ 2");
    }

    public static void m1(String s,Object o1,Object...args){
        System.out.println("m1 _ 3");
    }

    public static void main(String[] args) {

        m1(null,1);

        m1(null,1,2);

        m1(null,new Object[]{1});


    }

}
