package design_pattern.Strategy_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/15
 * \* Time: 21:30
 * \* Description:
 * \
 */
public class ByTrain implements TravelStrategy{

    @Override
    public void travelAlgorithm() {
        System.out.println("坐火车");
    }
}
