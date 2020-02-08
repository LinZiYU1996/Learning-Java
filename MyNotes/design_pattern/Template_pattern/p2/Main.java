package design_pattern.Template_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/7
 * \* Time: 20:36
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {

        HouseTemplate one = new HouseOne("刘备的房子");

        HouseTemplate two = new HouseTwo("曹操的房子");

        one.buildHouse();;

        System.out.println("");

        two.buildHouse();

    }
}
