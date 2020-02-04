package JDK_8.myNotes.J_Stream.D_reduce;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 15:29
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        ArrayList<Integer> newList = new ArrayList<>();

        ArrayList<Integer> accResult_ = Stream.of(2, 3, 4)
                .reduce(newList ,
                        (acc, item) -> {
                            acc.add(item);
                            System.out.println("item: " + item);
                            System.out.println("acc+ : " + acc);
                            System.out.println("BiFunction");
                            return acc;
                        }, (acc, item) -> null);
        System.out.println("accResult_: " + accResult_);

//item: 2
//acc+ : [2]
//BiFunction
//item: 3
//acc+ : [2, 3]
//BiFunction
//item: 4
//acc+ : [2, 3, 4]
//BiFunction
//accResult_: [2, 3, 4]
    }
}
