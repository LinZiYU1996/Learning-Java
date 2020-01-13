package chapter_21.c_21_2.c_21_2_4;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:16
 * \* Description:
 * \
 */
public class CallableDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newCachedThreadPool();

        ArrayList<Future<String>> res =
                new ArrayList<>();

        for (int i = 0; i < 10; i++) {


//            submit方法会产生future对象   它用callable返回结果的特定类型进行了参数化
            res.add(ex.submit(new TaskWithResult(i)));

        }

        for(Future<String> fs : res){
            System.out.println(fs.get());
        }


        ex.shutdown();

    }
}
