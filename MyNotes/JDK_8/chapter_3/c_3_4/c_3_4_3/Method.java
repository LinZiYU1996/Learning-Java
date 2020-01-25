package JDK_8.chapter_3.c_3_4.c_3_4_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 11:21
 * \* Description:
 * \
 */
public class Method {

    public static <T, R> List<R> map(List<T> list,
                                     Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for(T s: list){
            result.add(f.apply(s));
        }
        return result;
    }



//java.util.function.Function<T, R> 接口定义了一个叫作 apply 的方法，它接受一个
//泛型 T 的对象，并返回一个泛型 R 的对象。如果你需要定义一个Lambda，将输入对象的信息映射
//到输出，就可以使用这个接口（比如提取苹果的重量，或把字符串映射为它的长度）。在下面的
//代码中，我们向你展示如何利用它来创建一个 map 方法，以将一个 String 列表映射到包含每个
//String 长度的 Integer 列表。


    public static void main(String[] args) {
        List<Integer> l = map(
                Arrays.asList("lambdas","in","action"),
                (String s) -> s.length()
        );

        System.out.println(l);

    }
}
