package JDK_8.myNotes.J_Function.common_2;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 19:59
 * \* Description:
 * \
 */
public class M4 {

    public static void main(String[] args) {

        ToDoubleBiFunction<Integer,Integer> f1 = (i1,i2) ->
                (i1+i2) * 100;

        System.out.println(f1.applyAsDouble(1000,250));

        System.out.println("--------------------");

        ToIntBiFunction<String,String> f2 = (s1,s2) ->
                s1.length() + s2.length() ;

        System.out.println(f2.applyAsInt("abv","123456"));

        System.out.println("--------------------");

        ToLongBiFunction<Integer,Integer> f3 = (i1,i2) ->
                i1 + i2;

        System.out.println(f3.applyAsLong(123,115));

    }
}
