package JDK_8.myNotes.J_Stream.D_reduce;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 15:21
 * \* Description:
 * \
 */
public class M2 {

//    This is equivalent to:
//       *     boolean foundAny = false;
//     *     T result = null;
//     *     for (T element : this stream) {
//     *         if (!foundAny) {
//     *             foundAny = true;
//     *             result = element;
//     *         }
//     *         else
//     *             result = accumulator.apply(result, element);
//     *     }
//     *     return foundAny ? Optional.of(result) : Optional.empty();
    public static void main(String[] args) {

        List<Integer> l1 = Create_Data.supply_Integers();

        System.out.println(l1);

        System.out.println("----------------------");

        System.out.println(
                l1.stream()
                .reduce((x,y) -> x + y)
                .get()
        );
    }
}
