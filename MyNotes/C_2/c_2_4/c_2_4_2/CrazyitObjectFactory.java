package C_2.c_2_4.c_2_4_2;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 15:25
 * \* Description:
 * \
 */
public class CrazyitObjectFactory {

    public static Object getInstance(String clsName)
    {
        try
        {
            // 创建指定类对应的Class对象
            Class cls = Class.forName(clsName);
            // 返回使用该Class对象所创建的实例
            return cls.newInstance();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {

        Date d = (Date) getInstance("java.util.Date");

    }
}
