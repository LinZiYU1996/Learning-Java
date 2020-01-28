package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_3;

public interface Subject {


//    Subject 使用 registerObserver 方法可以注册一个新的观察者，使用 notifyObservers
//方法通知它的观察者一个新闻的到来
    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
