package Effective.P13;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/8
 * \* Time: 19:33
 * \* Description:
 * \
 */
public class User implements Cloneable{
/*
如果一定要覆盖clone方法，那么则需要了解以下它的注意事项了。

Clone规范

x.clone() != x //true
x.clone().getClass() == x.getClass() //true
x.clone.equals(x) // true
 */
    @Override
    public User clone() throws CloneNotSupportedException {
        User user = (User)super.clone(); // 1.先调用super.clone
//        user.set ...               // 2.在修正

        return user;
    }


}
