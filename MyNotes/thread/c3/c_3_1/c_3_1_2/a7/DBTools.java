package thread.c3.c_3_1.c_3_1_2.a7;

import javafx.geometry.VPos;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 10:33
 * \* Description:
 * \
 */
public class DBTools {

    volatile private boolean prevIsA = false;

    synchronized public void backupA(){
        try {
            while (prevIsA == true){
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(" * * * * * ");
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        prevIsA = true;
        notifyAll();
    }

    synchronized public void backupB(){
        try {
            while (prevIsA == false){
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(" + + + + +");
            }
            prevIsA= false;
            notifyAll();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
