package chapter_16.demo.d1;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:30
 * \* Description:
 * \
 */
public class ArrayOptions {

    public static void main(String[] args) {

//        未初始化的局部变量
        Matter[] a;

//        新生成一个数组对象时，所有引用被自动的初始化为null
//        基本类型的话就看是具体类型了
        Matter[] b = new Matter[5];

        System.out.println("b       " + Arrays.toString(b));

        System.out.println("________________________________");

        Matter[] c = new Matter[4];

        for (int i = 0; i < c.length; i++) {
            if (c[i] == null){
                c[i] = new Matter();
            }
        }


        Matter[] d = {
                new Matter(),
                new Matter(),
                new Matter()
        };

        a = new Matter[]{
                new Matter(),
                new Matter(),
                new Matter()
        };


        System.out.println("a len       " + a.length);

        System.out.println("b len       " + b.length);

        System.out.println("c len       " + c.length);

        System.out.println("d len       " + d.length);

        System.out.println("________________________________");

        a = d;


        System.out.println("a len       " + a.length);

        int[] e;

        int[] f = new int[5];

        System.out.println("f       " + Arrays.toString(f));

        int[] g = new int[4];

        for (int i = 0; i < g.length; i++) {
            g[i] = i*i;
        }

        int[] h = {11,23,122};


        System.out.println("f len       " + f.length);

        System.out.println("g len       " + g.length);

        System.out.println("h len       " + h.length);

        e = h;

        System.out.println("e len       " + e.length);

        e = new int[]{1,2};




    }



}
