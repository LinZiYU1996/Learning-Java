package thread.c3.c_3_1.c_3_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 21:14
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {
        //写两个线程 1.图片下载
        Object obj=new Object();
        Thread download=new Thread(){
            public void run() {
                System.out.println("开始下载图片");
                for (int i = 0; i < 101; i+=10) {
                    System.out.println("down"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("图片下载成功");
                synchronized (obj) {
                    obj.notify();//唤起
                }
                System.out.println("开始下载附件");
                for (int i = 0; i < 101; i+=10) {
                    System.out.println("附件下载"+i+"%");

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("附件下载成功");
            }
        };
        //2.图片展示
        Thread show=new Thread(){
            public void run(){
                synchronized (obj) {
                    try {
                        obj.wait();//阻塞当前
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("show:开始展示图片");
                    System.out.println("图片展示完毕");
                }

            }
        };
        download.start();
        show.start();
    }

}
