package design_pattern.Adapter_pattern.p4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:30
 * \* Description:
 * \
 */
public class InterfaceAdapterMode implements Targetable,Adapteeable{

    @Override
    public int v220() {
        return 220;
    }

    @Override
    public int V5() {
        return v220()/44;
    }
}
