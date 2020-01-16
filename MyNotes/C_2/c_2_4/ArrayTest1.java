package C_2.c_2_4;

import java.lang.reflect.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 14:42
 * \* Description:
 * \
 */
public class ArrayTest1 {

    public static void main(String[] args) {

        try
        {
            // 创建一个元素类型为String ，长度为10的数组
            Object arr = Array.newInstance(String.class, 10);
            // 依次为arr数组中index为5、6的元素赋值
            Array.set(arr, 5, "Java");
            Array.set(arr, 6, "Java EE");
            // 依次取出arr数组中index为5、6的元素的值
            Object book1 = Array.get(arr , 5);
            Object book2 = Array.get(arr , 6);
            // 输出arr数组中index为5、6的元素
            System.out.println(book1);
            System.out.println(book2);
        }
        catch (Throwable e)
        {
            System.err.println(e);
        }

    }
}
