package thread.c3.c_3_1.c_3_1_7.A4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/21
 * \* Time: 21:37
 * \* Description:
 * \
 */
public class LockTest {

            static MyReentrantLock lock = new MyReentrantLock();

        public static void main(String[] args) {

        for(int i=0;i<5;i++){

            Thread threadA = new Thread(new Runnable() {

                @Override

                public void run() {

                lock.lock();

                    try{

                    System.out.println("获取到锁处理业务逻辑");

                        Thread.sleep(1000) ;

                } catch (InterruptedException e) {

                e.printStackTrace();

                } finally{

                        lock.unlock();

                        System.out.println("释放锁");

                        System.out.println("=============================");

                }

            }

        });

        threadA.start();

        }

    }


}
