package design_pattern.Proxy_pattern.p2;

import design_pattern.Proxy_pattern.p1.IUserDao;
import design_pattern.Proxy_pattern.p1.UserDao;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/24
 * \* Time: 21:15
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        // 目标对象
        IUserDao target = new UserDao();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();

        /*
        class design_pattern.Proxy_pattern.p1.UserDao
        class com.sun.proxy.$Proxy0
        开始事务2
        ----已经保存数据!----
        提交事务2
         */

    }
}
