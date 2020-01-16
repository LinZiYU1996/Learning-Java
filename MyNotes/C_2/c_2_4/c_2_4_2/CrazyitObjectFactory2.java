package C_2.c_2_4.c_2_4_2;

import javax.swing.*;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 15:34
 * \* Description:
 * \
 */
public class CrazyitObjectFactory2 {

    public static <T> T getInstance(Class<T> cls)
    {
        try
        {
            return cls.newInstance();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args)
    {
        // 获取实例后无须类型转换
        Date d = CrazyitObjectFactory2.getInstance(Date.class);
        JFrame f = CrazyitObjectFactory2.getInstance(JFrame.class);
    }
}
