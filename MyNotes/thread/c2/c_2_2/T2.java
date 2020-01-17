package thread.c2.c_2_2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 11:09
 * \* Description:
 * \
 */
public class T2 {


//    结合JDK8语法，创建两个线程，分别启动，并且调用每个线程的join方法
//    join方法时被主线程调用的，因此第一个线程还没有结束生命周期的时候
//    第二个线程的join不会得到执行，但是此时第二个线程也已经启动了
//    运行后发现线程一和线程二会交替的输出直到它们结束生命周期。main线程的循环才开始运行



    public static void main(String[] args) throws InterruptedException {


//        1 : 定义两个线程，保存在threads里面
        List<Thread> threads = IntStream.range(1,3)
                .mapToObj(T2::create).collect(Collectors.toList());

//      2 : 启动两个线程
        threads.forEach(Thread::start);

//       3 : 执行两个线程的join方法
        for (Thread thread:threads){
            thread.join();
        }

//        4 : main线程循环输出
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "#" + i);
            shortSleep();
        }

    }


    private static Thread create(int seq){

        return new Thread(
                ()->
                {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName()+"#"+i);
                        shortSleep();
                    }
                },String.valueOf(seq)
        );

    }

    private static void shortSleep(){

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
