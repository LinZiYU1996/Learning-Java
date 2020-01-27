package JDK_8.chapter_6.c_6_6.c_6_6_1;

import JDK_8.chapter_2.c_2_3.c_2_3_4.Predicate;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 12:02
 * \* Description:
 * \
 */
public class M1 {


    public static <A>List<A> takeWhile(List<A> list, Predicate<A> predicate){
        int i = 0;
        for (A item : list) {

//            检查列表中的当前//项目是否满足谓词
            if (!predicate.test(item)){

//                如果不满足，返回该//项目之前的前缀子//列表
                return list.subList(0,i);
            }
            i++;
        }

//        列表中的所有项目//都满足谓词，因此返//回列表本身
        return list;
    }


//    利用这个方法，你就可以优化 isPrime 方法，只用不大于被测数平方根的质数去测试了

    public static boolean isPrime(List<Integer> primes, int candidate){
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return takeWhile(primes,i->i<=candidateRoot)
                .stream()
                .noneMatch(p-> candidate % p == 0);
    }


    public static void main(String[] args) {



    }
}
