package thread.c3.c_3_1.c_3_1_3.a13;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 20:25
 * \* Description:
 * \
 */
public class Thread_B extends Thread{

    private Service service;

    private Change_Service change_service;

    public Thread_B(Service service) {
        this.service = service;
    }

    public Thread_B(Change_Service change_service) {
        this.change_service = change_service;
    }

    @Override
    public void run() {
        change_service.methodB();
    }
}
