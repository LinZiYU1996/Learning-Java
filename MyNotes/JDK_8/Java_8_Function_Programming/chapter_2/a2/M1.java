package JDK_8.Java_8_Function_Programming.chapter_2.a2;

import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 21:31
 * \* Description:
 * \
 */
public class M1 {


    public static final int addOne(int a){
        return a+1;
    }

    public static int operation(int a,Function<Integer,Integer> function){
        return function.apply(a);
    }


    public static void main(String[] args) {

        int x = 1;

        int y = operation(x,x1 -> addOne(x1));

        System.out.printf("x= %d, y = %d\n", x, y);

        System.out.println("=====================");

//        当然你也可以使用lambda表达式来表示这段行为,只要保证一个参数,一个返回值就能匹配
        int z = operation(x,h->h+10);

        System.out.println(z);

    }
}
