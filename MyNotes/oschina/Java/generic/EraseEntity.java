package oschina.Java.generic;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:00
 * \* Description:
 * \
 */
public class EraseEntity<T> {

    /*
    不能使用 instanceof 操作符了，但可以用 Class.isInstance(Object)方法



     */
    Class<T> tClass;

    public EraseEntity(Class<T> tClass) {
        this.tClass = tClass;
    }

    public boolean instanceOf(Object t) {
//        return t instanceof T; // 这样就不可以了
        return tClass.isInstance(t); // 这样是可以的
    }



}
