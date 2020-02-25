package design_pattern.Command_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/25
 * \* Time: 20:39
 * \* Description:
 * \
 */
public class RemoteControl {

    Command onCommand;
    Command offComand;

    public RemoteControl(){}

    /**
     * 传入一组命令
     *
     * @param onCommand 打开电灯的命令对象
     * @param offComand 关闭电灯的命令对象
     */
    public void setCommand(Command onCommand, Command offComand){
        this.onCommand = onCommand;
        this.offComand = offComand;
    }

    /**
     * 打开电灯的按钮，通过 onCommand 调用 execute() 方法
     */
    public void onButtonWasPushed(){
        //execute() 方法中封装了打开电灯的方法
        onCommand.execute();
    }

    /**
     * 关闭电灯的按钮，通过 offComand 调用 execute() 方法
     */
    public void offButtonWasPushed(){
        //execute() 方法中封装了关闭电灯的方法
        offComand.execute();
    }

}
