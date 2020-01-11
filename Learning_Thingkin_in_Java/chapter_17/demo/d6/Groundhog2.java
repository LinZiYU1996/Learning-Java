package chapter_17.demo.d6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 16:02
 * \* Description:
 * \
 */
public class Groundhog2 extends Groundhog{

    public Groundhog2(int n) {
        super(n);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return  obj instanceof Groundhog2 &&
                (number == ((Groundhog2)obj).number);
    }


}
