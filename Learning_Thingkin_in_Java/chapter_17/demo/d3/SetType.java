package chapter_17.demo.d3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 21:43
 * \* Description:
 * \
 */
public class SetType {

    int i;

    public SetType(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SetType && ( i == ((SetType)obj).i);
    }

    @Override
    public String toString() {
        return "SetType{" +
                "i=" + i +
                '}';
    }
}
