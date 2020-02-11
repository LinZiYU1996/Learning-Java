package design_pattern.Builder_pattern.p3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 11:08
 * \* Description:
 * \
 */
public class Director {

    //装机人员

    private ComputerConfigBuilder mBuilder;

    //需要通过setBuilder来告诉他电脑需要什么配置，然后就可以通过createComputer来一步步组装电脑，组装完之后就可以调用getComputer方法来获取我们需要的电脑

    public void setBuilder(ComputerConfigBuilder builder){
        this.mBuilder = builder;
    }
    public void createComputer(){
        mBuilder.setCPU();
        mBuilder.setMemery();
        mBuilder.setHardDisk();
        mBuilder.setKeyboard();
        mBuilder.setMouse();
    }
    public Computer getComputer(){
        return mBuilder.getComputer();
    }
}
