package design_pattern.Mediator_pattenr.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/19
 * \* Time: 21:00
 * \* Description:
 * \
 */
public class ConcreteColleagueA extends Colleague{

//    具体同事类


    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 示意方法，执行某些操作
     */
    private void operation() {
        //在需要跟其他同事通信的时候，通知调停者对象
        getMediator().changed(this);
    }
}
