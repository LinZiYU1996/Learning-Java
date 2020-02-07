package design_pattern.Adapter_pattern.p6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:56
 * \* Description:
 * \
 */

//通过继承特性来实现适配器功能。
public class Typec2Vga1 extends Phone implements Vga{

    @Override
    public void vgaInterface() {
        typecPhone();
        System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}
