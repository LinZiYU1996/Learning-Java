package thread.c3.c_3_1.c_3_1_7.A2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 11:39
 * \* Description:
 * \
 */
public class C extends Thread{

    private Service service;

    public C(Service service) {
        this.service = service;
    }

    @Override
    public void run() {

        service.test();
    }
}
