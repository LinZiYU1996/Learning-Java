package JDK_8.myNotes.J_Predicate.common_1;



import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 10:51
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        Predicate<Integer> predicate1 = integer -> integer < 15;

        System.out.println(
                conditionFilter(Create_Data.supply_Integers(),predicate1)
        );


    }
    //高度抽象的方法定义，复用性高
    public static <T> List<T>  conditionFilter(List<T> list,
                                               Predicate<T> predicate){

        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());



    }


}
