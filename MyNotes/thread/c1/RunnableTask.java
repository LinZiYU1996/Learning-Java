package thread.c1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 20:37
 * \* Description:
 * \
 */
public class RunnableTask implements Runnable{

    @Override
    public void run() {
        System.out.println("thread run");
    }

    public static void main(String[] args) {

        RunnableTask task = new RunnableTask();

        new Thread(task).start();

    }
}
