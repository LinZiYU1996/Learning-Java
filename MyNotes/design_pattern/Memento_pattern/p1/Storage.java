package design_pattern.Memento_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/21
 * \* Time: 21:58
 * \* Description:
 * \
 */
public class Storage {


    //Storage类是存储备忘录的类，持有Memento类的实例


    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }


}
