package oschina.Java.generic;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 10:59
 * \* Description:
 * \
 */
public class T1<T> {
/*
不能使用 new 来创建泛型类型的具体对象，最好的方案是使用 Class.newInstance()或者使用工场模式


 */
//    public T getNewInstance() {
//        // return new T();
//        // Error:(12, 20) java: 意外的类型
//        //  需要: 类
//        //  找到:    类型参数T
//        try {
//            return t.newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }


}
