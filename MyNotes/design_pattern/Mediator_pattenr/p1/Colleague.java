package design_pattern.Mediator_pattenr.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/19
 * \* Time: 20:59
 * \* Description:
 * \
 */
public class Colleague {

    //抽象同事类


    /**
     * 持有一个调停者对象
     */
    private Mediator mediator;
    /**
     * 构造函数
     * @param mediator
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    /**
     * 获取当前同事类对应的调停者对象
     * @return
     */
    public Mediator getMediator() {
        return this.mediator;
    }


}
