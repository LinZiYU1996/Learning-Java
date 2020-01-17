package thread.c3.c_3_1.c_3_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 20:35
 * \* Description:
 * \
 */
public class Ta extends Thread{

    private MyList myList;

    public Ta(MyList myList){
        super();
        this.myList = myList;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                myList.add();
                System.out.println("添加了 "+(i+1)+"个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
