package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Collectors_Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:05
 * \* Description:
 * \
 */
public class MaxByMinByExample {

//Collectors.maxBy and Collectors.minBy
//Collectors.maxBy collects maximum element in stream for a given comparator. Collectors.minBy collects minimum element of a stream for a given comparator.


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30,10,20,35);


        list.stream()
                .collect(Collectors.maxBy(new MaxByMinByExample().new IntegerComp()))
                .ifPresent(integer -> System.out.println(integer));

        System.out.println("");

        list.stream()
                .collect(Collectors.minBy(new MaxByMinByExample().new IntegerComp()))
                .ifPresent(integer -> System.out.println(integer));


    }

    class IntegerComp implements Comparator<Integer> {
        @Override
        public int compare(Integer i1, Integer i2) {
            if(i1 >=i2 ){
                return 1;
            }else{
                return -1;
            }
        }
    }
}
