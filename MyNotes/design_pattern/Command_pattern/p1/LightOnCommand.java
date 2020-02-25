package design_pattern.Command_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/25
 * \* Time: 20:38
 * \* Description:
 * \
 */
public class LightOnCommand implements Command{

    Light light;

    /**
     * 通过构造器实力化 light 对象，在 execute() 方法中调用其对应的打开与关闭方法
     *
     * @param light 电灯对象
     */
    public LightOnCommand(Light light){
        this.light = light;
    }

    /**
     * 调用电灯打开的方法
     */
    @Override
    public void execute() {
        light.on();
    }
}
