package JDK_8.chapter_9.c_9_1.c_9_1_1;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 20:15
 * \* Description:
 * \
 */
public class Utils {

    public static void paint(List<Resizable> l){
        l.forEach(r -> {

//            调用每个形状自己的//setAbsoluteSize//方法
            r.setAbsoluteSize(42, 42);
//            r.draw();
        });
    }


}
