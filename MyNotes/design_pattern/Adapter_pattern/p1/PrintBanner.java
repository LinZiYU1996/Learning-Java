package design_pattern.Adapter_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:10
 * \* Description:
 * \
 */
public class PrintBanner extends Banner implements Print{
    // 交换装置 扮演适配器的角色


    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
            showWithAster();
    }
}
