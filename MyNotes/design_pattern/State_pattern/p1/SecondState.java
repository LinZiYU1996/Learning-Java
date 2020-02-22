package design_pattern.State_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/22
 * \* Time: 21:07
 * \* Description:
 * \
 */
public class SecondState implements State{


    // second->first
    public void lastStep(Context ctx) {
        ctx.setState(new FirstState());
    }

    // second->third
    public void nextStep(Context ctx) {
        ctx.setState(new ThirdState());
    }

    @Override
    public String toString() {
        return "Second State";
    }

}
