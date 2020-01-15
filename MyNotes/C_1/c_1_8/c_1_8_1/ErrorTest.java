package C_1.c_1_8.c_1_8_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 21:03
 * \* Description:
 * \
 */
public class ErrorTest {

    // 声明一个泛型方法，该泛型方法中带一个T泛型形参
    static <T> void test(Collection<T> from, Collection<T> to)
    {
        for (T ele : from)
        {
            to.add(ele);
        }
    }
    public static void main(String[] args)
    {
        List<Object> as = new ArrayList<>();
        List<String> ao = new ArrayList<>();
        // 下面代码将产生编译错误
//        test(as , ao);
    }


}
