package design_pattern.Adapter_pattern.p6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:57
 * \* Description:
 * \
 */
public class Typec2Vga2 implements Vga{

    private Phone phone;

    public Typec2Vga2(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void vgaInterface() {
        phone.typecPhone();
        System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}
