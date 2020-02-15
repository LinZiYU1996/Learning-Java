package design_pattern.Strategy_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/15
 * \* Time: 21:31
 * \* Description:
 * \
 */
public class Traveler {

    TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travelStyle(){
        strategy.travelAlgorithm();
    }
}
