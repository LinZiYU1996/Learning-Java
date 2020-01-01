package chapter_10.c_10_8.c_10_8_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:25 2020/1/1
 */
public abstract class Event {

    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() { // Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();


}
