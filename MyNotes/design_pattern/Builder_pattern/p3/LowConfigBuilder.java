package design_pattern.Builder_pattern.p3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 11:07
 * \* Description:
 * \
 */
public class LowConfigBuilder implements ComputerConfigBuilder{

    //创建一个低配版的套餐LowConfigBuilder ，让其实现ComputerConfigBuilder：
    private Computer mComputer;

    public LowConfigBuilder() {

        this.mComputer = new Computer();


    }

    @Override
    public void setCPU() {
        mComputer.setCPU("i5");

    }

    @Override
    public void setMemery() {
        mComputer.setMemory("8G");

    }

    @Override
    public void setHardDisk() {
        mComputer.setHardDisk("500G");

    }

    @Override
    public void setKeyboard() {
        mComputer.setKeyboard("薄膜键盘");

    }

    @Override
    public void setMouse() {
        mComputer.setMouse("有线鼠标");

    }

    @Override
    public Computer getComputer() {
        return mComputer;
    }
}
