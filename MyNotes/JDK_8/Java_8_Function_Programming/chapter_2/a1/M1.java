package JDK_8.Java_8_Function_Programming.chapter_2.a1;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 20:24
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Runnable runnable =
                () -> System.out.println("hello world");

        runnable.run();

        ActionListener actionListener =

                event -> System.out.println("button clicked");


        Runnable runnable1 =
                () ->
                {
                    System.out.println("hello");
                    System.out.println("world");
                };


        runnable1.run();


        BinaryOperator<Long> add =
                (x,y) -> x+y;


        BinaryOperator<Long> addExplicit =
                (Long x,Long y) -> x + y;

    }
}
