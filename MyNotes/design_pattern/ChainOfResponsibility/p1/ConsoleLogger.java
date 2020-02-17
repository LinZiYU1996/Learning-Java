package design_pattern.ChainOfResponsibility.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/17
 * \* Time: 22:06
 * \* Description:
 * \
 */
public class ConsoleLogger extends AbstractLogger{

//创建扩展了该记录器类的实体类。

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {

        System.out.println("Standard Console::Logger: " + message);


    }
}
