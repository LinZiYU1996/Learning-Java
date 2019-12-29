package chapter_10.c_10_6.c_10_6_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:43 2019/12/29
 */
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
// Implementations are completely interchangeable:
        serviceConsumer(Implementation2.factory);
    }


}
