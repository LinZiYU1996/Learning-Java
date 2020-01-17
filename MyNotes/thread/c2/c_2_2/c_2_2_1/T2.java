package thread.c2.c_2_2.c_2_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 17:00
 * \* Description:
 * \
 */
public class T2 {


//    要实现串行执行，可以加上join方法，实现线程1执行完成后才开始执行线程2，也就是串行执行


    //private static final Long count = 10000L;
    public static void main(String[] args){
        long base = System.currentTimeMillis();
        try {
            ThreadJoin_1 t1 = new ThreadJoin_1("线程1");
            ThreadJoin_1 t2 = new ThreadJoin_1("线程2");
            t1.start();
            t1.join();
            t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
        long time = System.currentTimeMillis() - base;
        System.out.println("执行时间："+time);
    }

}


class ThreadJoin_1 extends Thread{
    private static final Long count = 10L;

    public ThreadJoin_1(String name){
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
