package thread.c3.c_3_1.c_3_1_3.a13;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 20:23
 * \* Description:
 * \
 */
public class Service {

    synchronized public void methodA(){
        System.out.println("methodA 开始");
        boolean isContinueRun = true;
        while (isContinueRun){

        }
        System.out.println("methodA end");
    }

    synchronized public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
