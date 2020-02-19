package design_pattern.Mediator_pattenr.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/19
 * \* Time: 21:00
 * \* Description:
 * \
 */
public class ConcreteMediator implements Mediator{

//    具体调停者类


    //持有并维护同事A
    private ConcreteColleagueA colleagueA;
    //持有并维护同事B
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public void changed(Colleague c) {
        /**
         * 某一个同事类发生了变化，同行需要与其他同事交互
         * 具体协调相应的同事对象来实现协同行为
         */
    }
}
