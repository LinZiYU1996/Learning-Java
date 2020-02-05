package JDK_8.myNotes.J_Collectors.D_joining;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/4
 * \* Time: 13:56
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        List<String> strings = Create_Data.supply_Strings(6,6);

        System.out.println(strings);

        String s1 = strings.stream()
                .collect(Collectors.joining("   ,   ","[","]"));

        System.out.println(s1);

        /*
        [NJevkE, NJevkEgPHHJo, NJevkEgPHHJoEsIdWH, NJevkEgPHHJoEsIdWHpREMIs, NJevkEgPHHJoEsIdWHpREMIskTavvX, NJevkEgPHHJoEsIdWHpREMIskTavvXltdiUr]
[NJevkE   ,   NJevkEgPHHJo   ,   NJevkEgPHHJoEsIdWH   ,   NJevkEgPHHJoEsIdWHpREMIs   ,   NJevkEgPHHJoEsIdWHpREMIskTavvX   ,   NJevkEgPHHJoEsIdWHpREMIskTavvXltdiUr]
         */
    }
}
