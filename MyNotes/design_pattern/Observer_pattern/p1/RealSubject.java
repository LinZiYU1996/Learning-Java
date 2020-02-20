package design_pattern.Observer_pattern.p1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/20
 * \* Time: 21:30
 * \* Description:
 * \
 */
public class RealSubject implements MySubject{

//具体主题角色(RealSubject)

    private String subjectName = "官方"; //主题名称

    private List<MyObserver> list; //集合用来保存每个观察者

    public RealSubject() {
        list = new ArrayList<MyObserver>();
    }


    @Override
    public void addObserver(MyObserver o) {
        list.add(o);

    }

    @Override
    public void deleteObserver(MyObserver o) {
        list.remove(o);

    }

    @Override
    public void notifyObservers(String message) {
        for (MyObserver myObserver : list) {
            myObserver.update(message, subjectName);
        }
    }
}
