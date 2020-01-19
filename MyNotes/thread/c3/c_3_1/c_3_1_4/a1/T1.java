package thread.c3.c_3_1.c_3_1_4.a1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 21:33
 * \* Description:
 * \
 */
class MyService_1 {
    private ReentrantLock lock = new ReentrantLock();

    public void methodA() {
        lock.lock();
        try {
            System.out.println("MethodA begin ThreadName=" + Thread.currentThread().getName());
            for (int i = 1; i <= 3; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + "  " + i);
                Thread.sleep(1000);
            }
            System.out.println("MethodA end ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        lock.lock();
        try {
            System.out.println("MethodB begin ThreadName=" + Thread.currentThread().getName());
            for (int i = 1; i <= 3; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + "  " + i);
                Thread.sleep(1000);
            }
            System.out.println("MethodB end ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class ThreadA extends Thread {

    private MyService_1 service;

    ThreadA(MyService_1 service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}

class ThreadB extends Thread {

    private MyService_1 service;

    ThreadB(MyService_1 service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}

public class T1 {


//    多线程执行不同代码块互斥


    public static void main(String[] args) {
        MyService_1 service = new MyService_1();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}