package thread.c2.c_2_1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 10:26
 * \* Description:
 * \
 */
public class T4 {

    private static final int MAX_TASKS = 1000;

    private BlockingQueue<Task> queue = new LinkedBlockingQueue<Task>(MAX_TASKS);


//    如果抛出InterrruptedException意味着一个方法是阻塞方法，那么调用一个阻塞方法则意味着你的方法也是一个阻塞方法，
//    应该有某种策略来处理InterrruptedException。通常最容易的策略是自己抛出InterrruptedException，这样做可以使方法对中断做出响应，
//    而且只需将InterruptedException添加到throws子句。

    public void putTask(Task r) throws InterruptedException {
        queue.put(r);
    }

    public Task getTask() throws InterruptedException {
        return queue.take();
    }

    private class Task implements Runnable{
        @Override
        public void run() {

        }
    }


}
