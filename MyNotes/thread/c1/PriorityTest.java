package thread.c1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 21:58
 * \* Description:
 * \
 */
public class PriorityTest {


    public static void main(String[] args) {

        Thread t1 = new Thread(
                ()->
                {
                    while (true){
                        System.out.println("1");
                    }
                }
        );

        t1.setPriority(3);

        Thread t2 = new Thread(
                ()->
                {
                    while (true){
                        System.out.println("2");
                    }
                }
        );

        t2.setPriority(10);

        t1.start();
        t2.start();

    }
}
