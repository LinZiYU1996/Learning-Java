package design_pattern.State_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/22
 * \* Time: 21:07
 * \* Description:
 * \
 */
public class ThirdState implements State{


    // third->second
    public void lastStep(Context ctx) {
        ctx.setState(new SecondState());
    }

    // third->null
    public void nextStep(Context ctx) {
        ctx.setState(null);
    }

    @Override
    public String toString() {
        return "Third State";
    }

}
