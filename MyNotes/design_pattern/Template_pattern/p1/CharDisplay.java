package design_pattern.Template_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/7
 * \* Time: 20:24
 * \* Description:
 * \
 */
public class CharDisplay extends AbstractDisplay{

    private char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(aChar);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
