package design_pattern.Observer_pattern.p1;


/*
抽象主题角色(Subject)

 */
public interface MySubject {

    void addObserver(MyObserver o); //添加观察者
    void deleteObserver(MyObserver o); //删除观察者
    void notifyObservers(String message); //通知所有的观察者
}
