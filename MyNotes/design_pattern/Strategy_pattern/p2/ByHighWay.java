package design_pattern.Strategy_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/15
 * \* Time: 21:31
 * \* Description:
 * \
 */
public class ByHighWay implements TravelStrategy{

    @Override
    public void travelAlgorithm() {
        System.out.println("坐高铁");
    }
}
