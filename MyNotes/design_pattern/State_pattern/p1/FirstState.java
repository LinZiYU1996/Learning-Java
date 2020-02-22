package design_pattern.State_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/22
 * \* Time: 21:07
 * \* Description:
 * \
 */
public class FirstState implements State{


    // first->null
    public void lastStep(Context ctx) {
        ctx.setState(null);
    }

    // first->second
    public void nextStep(Context ctx) {
        ctx.setState(new SecondState());
    }

    @Override
    public String toString() {
        return "First State";
    }

}
