package oschina.Java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 10:59
 * \* Description:
 * \
 */
public class EraseMain {
    /**
     * 同样的类型，不同的泛型参数在编译期代表着不同类型，在运行期就没有差别了
     * @param args
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
//        list1 = list2; // 编译期是不同的
        System.out.println(list1.getClass().getName());
        System.out.println(list2.getClass().getName());
        // 运行期类型是相同的
        System.out.println(list1.getClass() == list2.getClass());
    }



}
