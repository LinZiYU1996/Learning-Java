package design_pattern.ChainOfResponsibility.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/17
 * \* Time: 22:07
 * \* Description:
 * \
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);

    }
}
