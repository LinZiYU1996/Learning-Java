package design_pattern.Adapter_pattern.p5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 22:02
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {
        Listen_3_5 listen_3_5 = new Listen_Adapter();
        listen_3_5.listen_by_3_5();
    }


}
