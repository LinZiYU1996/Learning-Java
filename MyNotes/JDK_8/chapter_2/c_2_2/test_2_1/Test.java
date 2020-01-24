package JDK_8.chapter_2.c_2_2.test_2_1;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;
import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:20
 * \* Description:
 * \
 */
public class Test {


//    现在你就可以给 prettyPrintApple 方法传递多种行为了。为此，你首先要实
//例化 AppleFormatter 的实现，然后把它们作为参数传给 prettyPrintApple ：


    public static void main(String[] args) {

        List<Apple> apples = CreateDataForApple.create_2();

        Method.prettyPrintApple(apples,new AppleSimpleFormatter());

        System.out.println("==========================================");

        Method.prettyPrintApple(apples,new AppleFancyFormatter());

    }
}
