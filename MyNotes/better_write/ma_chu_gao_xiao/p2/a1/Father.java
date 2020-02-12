package better_write.ma_chu_gao_xiao.p2.a1;

import java.sql.SQLException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 16:08
 * \* Description:
 * \
 */
public class Father {

    protected Number doSomething(int a, Integer b, Object c) throws SQLException {

        System.out.println("fa do");
        return new Integer(7);
    }
}
