package thread.c3.c_3_1.c_3_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 21:56
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();

    }
}
