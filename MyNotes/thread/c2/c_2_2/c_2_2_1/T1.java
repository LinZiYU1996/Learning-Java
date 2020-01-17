package thread.c2.c_2_2.c_2_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 16:59
 * \* Description:
 * \
 */
public class T1 {

//    并行执行的


    //private static final Long count = 10000L;
    public static void main(String[] args){
        long base = System.currentTimeMillis();
        try {
            ThreadJoin t1 = new ThreadJoin("线程1");
            ThreadJoin t2 = new ThreadJoin("线程2");
            t1.start();
            t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
        long time = System.currentTimeMillis() - base;
        System.out.println("执行时间："+time);
    }

}


class ThreadJoin extends Thread{
    private static final Long count = 10L;

    public ThreadJoin(String name){
        super(name);
    }

    @Override
    public void run() {
        //super.run();
        for(int i = 1; i <= count; i ++){
            System.out.println(this.getName()+":"+i);
        }
    }
}
