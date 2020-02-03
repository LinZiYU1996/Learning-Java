package JDK_8.myNotes.J_UnaryOperator.common_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:33
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        UnaryOperator<Integer> u1 = integer ->
                integer + 100;

        System.out.println(u1.apply(100));

        System.out.println("-----------");

        List<String> strings = Arrays.asList(
                "asas",
                "ddd",
                "csd"
        );

        UnaryOperator<String> unaryOperator = s ->
                s;

        for (String s : strings) {
            System.out.println(unaryOperator.apply(s));
        }

        System.out.println("-----------");

        List<Integer> list = Arrays.asList(10,20,30,40,50);

        UnaryOperator<Integer> unaryOperator2 = integer -> integer*integer;

        unaryOperatorFun(unaryOperator2,list)
                .forEach(System.out::println);


    }

    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> list){
        List<Integer> uniList = new ArrayList<>();
        list.forEach(i->uniList.add(unaryOpt.apply(i)));
        return uniList;
    }


}
