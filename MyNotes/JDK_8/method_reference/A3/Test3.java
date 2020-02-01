package JDK_8.method_reference.A3;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 15:16
 * \* Description:
 * \
 */
public class Test3 {

//类的任意对象的实例方法引用的语法格式为： 类名::实例方法名 ， 这种方法引用相对比较复杂

    public static void main(String[] args) {


        String[] strings = new String[]
                {

                };


        Arrays.sort(strings,(s1,s2) ->
                s1.compareToIgnoreCase(s2));


        Arrays.sort(strings,String::compareToIgnoreCase);

//上述示例中，strs为一个String数组，lambda表达式(s1,s2)->s1.compareToIgnoreCase(s2)实现函数式接口的是Comparator接口, 我们看下jdk8中Comparator接口的源码（截取部分）：

//  @FunctionalInterface
//  public interface Comparator<T> {
//      int compare(T o1, T o2);
//  }


//而String类的compareToIgnoreCase方法源码为：


//    public int compareToIgnoreCase(String str) {
//        return CASE_INSENSITIVE_ORDER.compare(this, str);
//    }

        //可以发现函数式接口Comparator<String>的compare方法比String类的compareToIgnoreCase方法多了一个String类型的入参




    }
}
