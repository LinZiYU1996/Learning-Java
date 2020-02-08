package design_pattern.Template_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/7
 * \* Time: 20:27
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {

        AbstractDisplay abstractDisplay = new CharDisplay('H');

        AbstractDisplay abstractDisplay2 = new StringDisplay("hello");

        AbstractDisplay abstractDisplay3 = new StringDisplay("你好啊");

        abstractDisplay.display();

        System.out.println("");

        abstractDisplay2.display();

        System.out.println("");

        abstractDisplay3.display();


    }
}
