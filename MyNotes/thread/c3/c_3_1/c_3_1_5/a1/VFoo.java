package thread.c3.c_3_1.c_3_1_5.a1;

import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 11:35
 * \* Description:
 * \
 */
public class VFoo {

    final static int MAX  = 5;


//    不添加volatile 的话  reader线程根本感知不到变化
    static volatile int init_val = 0;

    public static void main(String[] args) {

        new Thread(
                ()->
                {
                    int localVal = init_val;
                    while (localVal<MAX){
                        if (init_val!=localVal){
                            System.out.printf("init val is upadte to  [%d]\n",init_val);
                            localVal = init_val;
                        }
                    }
                },"reader"
        ).start();


        new Thread(
                ()->
                {
                    int localVal = init_val;
                    while (localVal<MAX){
                        System.out.printf("init change will to  [%d]\n",++localVal);
                        init_val = localVal;
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                },"updater"
        ).start();
    }
}
