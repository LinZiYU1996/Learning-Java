package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_3;

import C_1.c_1_3.Sub;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:45
 * \* Description:
 * \
 */
public class Feed implements Subject {

//     Feed 类在内部维护了一个观察者列表，一条新闻到达时，它就
//进行通知

    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer o) {
            this.observers.add(o);
    }

    @Override
    public void notifyObservers(String tweet) {

        observers.forEach(o->o.notify(tweet));

    }


    public static void main(String[] args) {

        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());
        f.notifyObservers("The queen said her favourite book is Java 8 in Action!");

    }
}
