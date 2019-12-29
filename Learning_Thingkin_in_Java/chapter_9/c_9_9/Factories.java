package chapter_9.c_9_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:25 2019/12/29
 */
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
// Implementations are completely interchangeable:
        serviceConsumer(new Implementation2Factory());
    }


}
