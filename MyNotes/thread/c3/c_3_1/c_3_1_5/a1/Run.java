package thread.c3.c_3_1.c_3_1_5.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 15:44
 * \* Description:
 * \
 */
public class Run {


    public static void main(String[] args) {

        SimpleCAS simpleCAS = new SimpleCAS();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(simpleCAS);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        System.out.println(simpleCAS.getValue());


    }


}
