package JDK_8.chapter_11.c_11_1.A;

import sun.net.idn.Punycode;

import java.util.concurrent.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 10:12
 * \* Description:
 * \
 */
public class M1 {

    //执//行耗时的操作
    public static Double doSomeLongComputation(){
        return 1.0;
    }

    //做其他的事情
    public static void doSomethingElse(){}


    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Double> future = executorService.submit(new Callable<Double>() {

//            以异步方式在//新的线程中执//行耗时的操作
            @Override
            public Double call() throws Exception {
                return doSomeLongComputation();
            }
        });

//        异步操作进行的同时，//你可以做其他的事情
        doSomethingElse();

//        获取异步操作的//结果，如果最终被//阻塞，无法得到结//果，那么在最多等//待1秒钟之后退出
        Double res = future.get(1, TimeUnit.SECONDS);



    }

}
