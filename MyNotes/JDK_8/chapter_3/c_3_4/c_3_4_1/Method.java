package JDK_8.chapter_3.c_3_4.c_3_4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 11:15
 * \* Description:
 * \
 */
public class Method {


//    java.util.function.Predicate<T> 接口定义了一个名叫 test 的抽象方法，它接受泛型
//T 对象，并返回一个 boolean 。这恰恰和你先前创建的一样，现在就可以直接使用了。在你需要
//表示一个涉及类型 T 的布尔表达式时，就可以使用这个接口



    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> res = new ArrayList<>();
        for (T s:list){
            if (p.test(s)){
                res.add(s);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jdjdd");
        list.add(" ");
        list.add("jfjjafjfjf");
        list.add("");
        list.add("45445445");
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(list, nonEmptyStringPredicate);
        System.out.println(nonEmpty);

    }
}
