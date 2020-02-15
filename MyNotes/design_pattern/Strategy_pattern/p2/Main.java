package design_pattern.Strategy_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/15
 * \* Time: 21:32
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Traveler traveler = new Traveler();

        traveler.setStrategy(new ByTrain());

        traveler.travelStyle();

    }
}
