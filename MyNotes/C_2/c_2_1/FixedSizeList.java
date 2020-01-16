package C_2.c_2_1;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:47
 * \* Description:
 * \
 */
public class FixedSizeList {

    public static void main(String[] args)
    {
        List fixedList = Arrays.asList("Java"
                , "Java EE");
        // 获取fixedList的实现类，将输出Arrays$ArrayList
        System.out.println(fixedList.getClass());
        // 使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);
        // 试图增加、删除元素都会引发UnsupportedOperationException异常
        fixedList.add("Android");
        fixedList.remove("C++");
    }
}
