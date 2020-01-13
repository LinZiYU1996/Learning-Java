package chapter_21.c_21_2.c_21_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 21:29
 * \* Description:
 * \
 */
public class LisstOff implements Runnable{

//    这个任务将显示发射之前的倒计时


    protected int countDown = 10;

    private static int takeCount = 0;


//    标识符id可以区分多个不同的实例  它是final的
    private final int id = takeCount++;

    public LisstOff() {
    }

    public LisstOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }




    @Override
    public void run() {

        while (countDown-- > 0){

            System.out.println(status());

//            让出资源
            Thread.yield();
        }
    }
}
