package chapter_15.c_15_4.c_15_4_6;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:13 2020/1/5
 */
public class Sets {


//    在前三个方法中，都将第一个参数Set复制了一份，将Set中的所有引用都存入一个新的
//    HashSet对象中，因此，我们并未直接修改参数中的Set。返回的值是一个全新的Set对象。
//这四个方法表达了如下的数学集合操作：union()返回一个Set,它将两个参数合并在一起，
// intersection()返回的Set只包含两个参数共有的部分，difference()
// 方法从superset中移除subset包含的元素1complement()返回的Set包含除了交集之外的所有元素。


    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    public static <T>
    Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    // Subtract subset from superset:
    public static <T> Set<T>
    difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }
    // Reflexive--everything not in the intersection:
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }



}
