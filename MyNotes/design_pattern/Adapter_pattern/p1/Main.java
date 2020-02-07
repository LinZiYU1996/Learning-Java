package design_pattern.Adapter_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:11
 * \* Description:
 * \
 */
public class Main {

    /*
        Banner类  showWithParen方法showWithAster方法被完全隐藏起来了
     */
    public static void main(String[] args) {

        Print print = new PrintBanner("hello");

        print.printWeak();

        print.printStrong();

    }
}
