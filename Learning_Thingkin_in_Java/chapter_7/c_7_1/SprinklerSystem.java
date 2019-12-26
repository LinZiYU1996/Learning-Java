package chapter_7.c_7_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:03 2019/12/26
 */
public class SprinklerSystem {

//    到目前为止，本书已经非常频繁地使用合成。 您只需放置
//    新类中的对象引用。 例如，假设您想要一个可以容纳
//    几个String对象，几个基元和另一个类的对象。 对于非
//    基本对象，您将引用放在新类中，但您定义了基本对象
//    直：

    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return  " valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }
    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }


}
