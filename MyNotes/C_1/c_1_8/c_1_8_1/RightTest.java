package C_1.c_1_8.c_1_8_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 21:07
 * \* Description:
 * \
 */
public class RightTest {

    // 声明一个泛型方法，该泛型方法中带一个T形参
    static <T> void test(Collection<? extends T> from , Collection<T> to)
    {
        for (T ele : from)
        {
            to.add(ele);
        }
    }
    public static void main(String[] args)
    {
        List<Object> ao = new ArrayList<>();
        List<String> as = new ArrayList<>();
        // 下面代码完全正常
        test(as , ao);
    }

}
