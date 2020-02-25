package design_pattern.Command_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/25
 * \* Time: 20:39
 * \* Description:
 * \
 */
public class RemoteLoader {


    public static void main(String[] args) {
        // 定义一个远程遥控器
        RemoteControl remoteControl = new RemoteControl();
        // 定义一个电灯对象
        Light light = new Light();
        // 打开电灯的命令对象
        Command onCommand = new LightOnCommand(light);
        // 关闭电灯的命令对象
        Command offCommand = new LightOffCommand(light);

        remoteControl.setCommand(onCommand,offCommand);
        remoteControl.onButtonWasPushed();
        remoteControl.offButtonWasPushed();

    }
}
