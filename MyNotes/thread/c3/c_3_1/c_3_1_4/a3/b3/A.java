package thread.c3.c_3_1.c_3_1_4.a3.b3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:46
 * \* Description:
 * \
 */
public class A extends Thread{

    private Service service;

    public A(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
