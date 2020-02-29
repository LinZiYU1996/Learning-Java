package Effective.P3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/29
 * \* Time: 20:51
 * \* Description:
 * \
 */
public class Elvis {

    //方法一：公有静态成员是个final域

    //但是要注意可以借助AccessibleObject.setAccessible方法，通过反射机制调用私有构造器，破坏单例的初衷！（为了破解，可以在构造器中进行判断，创建第二个实例时抛出异常。）



    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public void dosomething() {

    }


}
