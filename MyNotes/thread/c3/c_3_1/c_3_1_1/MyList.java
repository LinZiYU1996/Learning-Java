package thread.c3.c_3_1.c_3_1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 20:35
 * \* Description:
 * \
 */
public class MyList {

    private List list = new ArrayList();

    public void add(){
        list.add("hello");
    }

    public int size(){
        return list.size();
    }
}
