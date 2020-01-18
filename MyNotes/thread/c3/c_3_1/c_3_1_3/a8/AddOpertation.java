package thread.c3.c_3_1.c_3_1_3.a8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 15:05
 * \* Description:
 * \
 */
public class AddOpertation implements Runnable{

    private  int num = 0;

    public void add(){
        for (int i = 0; i < 1000; i++) {
            num++;
            System.out.println(num);
        }
    }

    @Override
    public void run() {
        add();
    }

    public  int getNum() {
        return num;
    }
}
