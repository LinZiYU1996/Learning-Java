package design_pattern.Proxy_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/24
 * \* Time: 21:12
 * \* Description:
 * \
 */
public class UserDao implements IUserDao{


    @Override
    public void save() {
        System.out.println("----已经保存数据!----");

    }
}
