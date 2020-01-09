package chapter_15.lesson.l1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:02
 * \* Description:
 * \
 */
public class ByteSet {

    Byte[] bytes = {1,2,3,4,5,6,7,8,9};

    Set<Byte> myset =
            new HashSet<>(Arrays.asList(bytes));

//    error
//    Set<Byte> myset2 =
//            new HashSet<Byte>(Arrays.asList(1,2,3,4,5,6,7,8,9));


}
