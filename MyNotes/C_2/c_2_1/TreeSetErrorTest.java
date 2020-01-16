package C_2.c_2_1;

import java.util.TreeSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:22
 * \* Description:
 * \
 */

class Err{}
public class TreeSetErrorTest {

    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();
        // 向TreeSet集合中添加Err对象
        // 自然排序时，Err没实现Comparable接口将会引发错误
//        Exception in thread "main" java.lang.ClassCastException: C_2.c_2_1.Err cannot be cast to java.lang.Comparable
        ts.add(new Err());
    }


}
