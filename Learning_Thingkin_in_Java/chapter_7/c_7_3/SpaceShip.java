package chapter_7.c_7_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:21 2019/12/26
 */
public class SpaceShip extends SpaceShipControls{

    private String name;
    public SpaceShip(String name) { this.name = name; }
    public String toString() { return name; }
    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
