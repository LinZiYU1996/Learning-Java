package design_pattern.Command_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/25
 * \* Time: 20:39
 * \* Description:
 * \
 */
public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    /**
     * 调用电灯关闭的方法
     */
    @Override
    public void execute() {
        light.off();
    }
}
