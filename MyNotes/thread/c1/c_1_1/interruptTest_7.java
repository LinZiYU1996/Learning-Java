package thread.c1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 9:56
 * \* Description:
 * \
 */
public class interruptTest_7 {

    //这里用来打印消耗的时间
    private static long time = 0;
    private static void resetTime(){
        time = System.currentTimeMillis();
    }
    private static void printContent(String content){
        System.out.println(content + "     时间：" + (System.currentTimeMillis() - time));
    }

    public static void main(String[] args) {

        test1();

    }

    private static void test1(){

        Thread1 thread1 = new Thread1();
        thread1.start();

        //延时3秒后interrupt中断
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
        printContent("执行中断");

    }

    private static class Thread1 extends Thread{

        @Override public void run() {

            resetTime();

            int num = 0;
            while (true){
                if(isInterrupted()){
                    printContent("当前线程 isInterrupted");
                    break;
                }

                num++;

                if(num % 100 == 0){
                    printContent("num : " + num);
                }
            }

        }

    }

}
