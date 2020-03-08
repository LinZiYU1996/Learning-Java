package Effective.P13;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/8
 * \* Time: 19:35
 * \* Description:
 * \
 */
public class Stack {

    /*
    如果类中包含的域是指向一个可变对象的引用，那么就要小心的对其进行clone。
例如，若类中存在一个Object[]数组，则可以参考一下做法：
     */


    private Object[] elements;
    private int size = 0;

    @Override
    public Stack clone() throws CloneNotSupportedException {
        Stack result = (Stack) super.clone();
        result.elements = this.elements.clone();
        return result;
    }


}
