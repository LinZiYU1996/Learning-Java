package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_4;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 17:08
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {
        UnaryOperator<String> headerProcessing =
                (String text) -> "From Raoul, Mario and Alan: " + text;



        UnaryOperator<String> spellCheckerProcessing =
                (String text) -> text.replaceAll("labda", "lambda");



//        将 两 个 方 法//结合起来，结//果 就 是 一 个//操作链
        Function<String, String> pipeline =
                headerProcessing.andThen(spellCheckerProcessing);


        String result = pipeline.apply("Aren't labdas really sexy?!!");

        System.out.println(result);
    }
}
