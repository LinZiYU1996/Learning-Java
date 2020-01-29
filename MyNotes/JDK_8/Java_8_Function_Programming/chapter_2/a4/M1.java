package JDK_8.Java_8_Function_Programming.chapter_2.a4;

import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 22:13
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        Supplier<String> stringSupplier = () ->
                "djjdjdjd";

        System.out.println(stringSupplier.get());

    }
}
