package design_pattern.Builder_pattern.p3;


/*
创建一个抽象的电脑组装过程的Builder类
 */
public interface ComputerConfigBuilder {

    void setCPU();
    void setMemery();
    void setHardDisk();
    void setKeyboard();
    void setMouse();
    Computer getComputer();
/*
电脑组装一般都需要安装CPU、内存条、硬盘、键盘鼠标等，我们把这一安装过程给抽象出来，也就是这里的ComputerConfigBuilder ，至于具体安装什么需要其实现类来实现，另外其中还定义了一个获取Conputer的方法。


 */

}
