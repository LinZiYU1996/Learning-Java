package design_pattern.Memento_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/21
 * \* Time: 21:57
 * \* Description:
 * \
 */
public class Memento {

    //Memento类是备忘录类

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }




}
