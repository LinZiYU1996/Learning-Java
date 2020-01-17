package thread.c3.c_3_1.c_3_1_2.a;

import java.util.LinkedList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:12
 * \* Description:
 * \
 */
public class EventQueue {

    private final int max;

    static class Event
    {

    }

    private final LinkedList<Event> events
            = new LinkedList<>();

    private final static int DEFAULT = 10;

    public EventQueue() {
        this(DEFAULT);
    }

    public EventQueue(int max) {
        this.max = max;
    }

    public void offer(Event event){
        synchronized (events){
            if (events.size() >= max) {
                try {
                    System.out.println("full");
                    events.wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            System.out.println("new event submitted");
            events.addLast(event);
            events.notify();
        }
    }

    public Event take(){
        synchronized (events){
            if (events.isEmpty()){
                try {
                    System.out.println("empty");
                    events.wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            Event event = events.removeFirst();
            this.events.notify();
            System.out.println(event + "is handled");
            return event;
        }
    }
}
