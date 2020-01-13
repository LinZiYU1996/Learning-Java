package chapter_21.c_21_4.c_21_4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 15:47
 * \* Description:
 * \
 */
public class Entrance implements Runnable {

    private static Count count = new Count();
    private static List<Entrance> entrances =
            new ArrayList<Entrance>();
    private int number = 0;
    // Doesn’t need synchronization to read:
    private final int id;
    private static volatile boolean canceled = false;
    // Atomic operation on a volatile field:
    public static void cancel() { canceled = true; }
    public Entrance(int id) {
        this.id = id;
// Keep this task in a list. Also prevents
// garbage collection of dead tasks:
        entrances.add(this);
    }
    public void run() {
        while(!canceled) {
            synchronized(this) {
                ++number;
            }
            print(this + " Total: " + count.increment());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch(InterruptedException e) {
                print("sleep interrupted");
            }
        }
        print("Stopping " + this);
    }
    public synchronized int getValue() { return number; }
    public String toString() {
        return "Entrance " + id + ": " + getValue();
    }
    public static int getTotalCount() {
        return count.value();
    }
    public static int sumEntrances() {
        int sum = 0;
        for(Entrance entrance : entrances)
            sum += entrance.getValue();
        return sum;
    }


}
