package thread.c3.c_3_1.c_3_1_3.a12;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 20:10
 * \* Description:
 * \
 */
public class Service {

    public static void print(String param){

        try {
            synchronized (param){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
