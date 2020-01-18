package thread.c3.c_3_1.c_3_1_3.a12.b12;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 20:12
 * \* Description:
 * \
 */
public class BThread extends Thread{

    private Service service;

    public BThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
