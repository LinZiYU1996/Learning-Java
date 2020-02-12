package better_write.ma_chu_gao_xiao.p2.a2;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 21:46
 * \* Description:
 * \
 */
public class ListNoGeneric {


    public static void main(String[] args) {

        List l1 = new ArrayList();

        l1.add(new Object());
        l1.add(new Integer(111));
        l1.add(new String("hello l1l1l1"));

        List<Object> l2 = l1;

        l2.add(new Object());
        l2.add(new Integer(111));
        l2.add(new String("hello l2l2l2"));

        List<Integer> l3 = l1;

        l3.add(new Integer(333));

        List<?> l4 = l1;

        l1.remove(0);

        l4.clear();

        // 报错
//        l4.add(new Object());



    }
}
