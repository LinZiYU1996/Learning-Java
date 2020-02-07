package design_pattern.Adapter_pattern.p5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:46
 * \* Description:
 * \
 */
public class Listen_Adapter extends Mi_9 implements Listen_3_5{

    @Override
    public void listen_by_3_5() {
        super.listen_by_type_c();
    }
}
