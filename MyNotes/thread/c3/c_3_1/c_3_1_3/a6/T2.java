package thread.c3.c_3_1.c_3_1_3.a6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:51
 * \* Description:
 * \
 */
public class T2 extends Thread{


    int num;

    public T2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        num++;
    }
}
