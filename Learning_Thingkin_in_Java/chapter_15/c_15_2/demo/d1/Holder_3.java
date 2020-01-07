package chapter_15.c_15_2.demo.d1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:11 2020/1/7
 */
public class Holder_3<T> {

    private T a;

    public Holder_3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }


    public static void main(String[] args) {

        Holder_3<Apple> holder_3 = new Holder_3<>(new Apple());


//        此处不需要转型了
        Apple apple = holder_3.getA();

//        错误
//        holder_3.setA("String");

//        比起Holder_2的Object类型，Holder_3我们可以不指定类型
//        而是以后再决定，所以使用  类型参数，用尖括号括住，放在 类名后面



    }
}
