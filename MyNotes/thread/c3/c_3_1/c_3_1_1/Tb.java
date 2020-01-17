package thread.c3.c_3_1.c_3_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 20:37
 * \* Description:
 * \
 */
public class Tb extends Thread{

    private MyList myList;

    public Tb(MyList myList) {
        super();
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while (true){
                if (myList.size() == 5){
                    System.out.println("==5 线程退出");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
