package chapter_15.c_15_4.c_15_4_6;

import java.util.EnumSet;
import java.util.Set;

import static chapter_15.c_15_4.c_15_4_6.Alphabet.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:29 2020/1/7
 */
public class AlphabetSet {


    public static void main(String[] args) {


        Set<Alphabet> set1 =
                EnumSet.range(A,D);

        Set<Alphabet> set2 =
                EnumSet.range(A,X);

        System.out.println(set1);

        System.out.println("______________________________");

        System.out.println(set2);

        System.out.println("______________________________");

        System.out.println("union" + Sets.union(set1,set2));

        System.out.println("______________________________");

        System.out.println("intersection" + Sets.intersection(set1,set2));


    }
}
