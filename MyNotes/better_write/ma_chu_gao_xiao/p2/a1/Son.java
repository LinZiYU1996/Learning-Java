package better_write.ma_chu_gao_xiao.p2.a1;

import java.sql.SQLClientInfoException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 16:09
 * \* Description:
 * \
 */
public class Son extends Father{


    /*
            1  权限扩大

            2 返回值是 Number的子类

            3 抛出异常是 SQLException 的子类

            4 方法名必须一致

            5 参数类型和个数必须一致

            6 必须加    @Override

     */

    @Override
    public Number doSomething(int a, Integer b, Object c) throws SQLClientInfoException {

        if (a == 0){
            throw new SQLClientInfoException();
        }

        return new Integer(5656);
    }
}
