package design_pattern.Factory_pattern.p5.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:53
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_GK);
        noodles.desc();

    }
}
