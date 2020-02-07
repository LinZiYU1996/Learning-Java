package design_pattern.Adapter_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:08
 * \* Description:
 * \
 */
public class Banner {
    // 实际情况


    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")" );
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
