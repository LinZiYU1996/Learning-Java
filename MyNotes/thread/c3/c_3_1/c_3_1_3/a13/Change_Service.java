package thread.c3.c_3_1.c_3_1_3.a13;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 20:27
 * \* Description:
 * \
 */
public class Change_Service {

    Object object1 = new Object();

    public void methodA(){
        synchronized (object1){
            System.out.println("methodA 开始");
            boolean isContinueRun = true;
            while (isContinueRun){

            }
            System.out.println("methodA end");
        }

    }


    Object object2 = new Object();
    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }

    }


}
