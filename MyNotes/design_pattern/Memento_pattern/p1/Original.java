package design_pattern.Memento_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/21
 * \* Time: 21:57
 * \* Description:
 * \
 */
public class Original {


    //Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }




}
