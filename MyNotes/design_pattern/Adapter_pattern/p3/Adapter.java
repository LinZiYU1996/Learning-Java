package design_pattern.Adapter_pattern.p3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:21
 * \* Description:
 * \
 */
public class Adapter extends TypeC_Charge implements MicroUSB{

    @Override
    public void isMicroUSB() {
        isTypeC();
    }
}
