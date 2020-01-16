package thread.c1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 20:40
 * \* Description:
 * \
 */
public class CallerTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "world";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());

        new Thread(futureTask).start();

        String res = futureTask.get();

        System.out.println(res);
    }
}
