package Effective.P3;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/29
 * \* Time: 20:54
 * \* Description:
 * \
 */
public class Elvis_3 implements Serializable {


    //为了使Singleton类变成是可序列化的。仅仅“implements Serializable”是不够的
    // ，因为每次反序列化一个序列化的实例时，都会创建一个新的实例。
    // 为了保持单例需要下面这个readResolve方法。



    private static final Elvis_3 INSTANCE = new Elvis_3();

    private Elvis_3() {}

    public static Elvis_3 getInstance() {
        return INSTANCE;
    }

    /**
     * 序列化对象通过流传给调用者，当调用者从ObjectInputStream流中读取序列化对象时，
     * 序列化对象返回给调用者之前会先查看是否已经实现了这个方法。
     * 如果实现那么就返回这个方法的返回值，如果返回值与调用者期望获得的类类型不匹配，
     * 那么就会报ClassCastException错误。
     * 但是，前提是，在调用者通过流获取序列化对象时，序列化对象必须已经完全构造，
     * 不然序列化对象不会找这个方法。
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
