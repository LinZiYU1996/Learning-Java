package oschina.Java.generic.pack2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/27
 * \* Time: 11:08
 * \* Description:
 * \
 */
public class WildCardTest2 {
/*
容器的这一特点与数组不同，子类数组对象可以赋值给基类数组变量（类似向上转型），但是在运行期jvm 可以知道数组元素中的对象类型是哪个具体子类，所以如果将数组中元素赋值时，如果不是原数组中的类型，会报错（ArrayStoreException）


 */
    public static void main(String[] args) {

//        InterfaceA<?>[] arr1 = new Impl[3];
//        arr1[0] = new Impl();
//        //会报错
//        //arr1[2] = new Impl2();
//
//        // 兼容的类型可以
//        InterfaceA<?>[] arr2 = new InterfaceA[4];
//        arr2[0] = new Impl();
//        arr2[0] = new Impl2();
    }



}
