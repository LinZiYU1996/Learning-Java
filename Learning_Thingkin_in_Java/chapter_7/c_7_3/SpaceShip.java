package chapter_7.c_7_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:21 2019/12/26
 */
public class SpaceShip extends SpaceShipControls{

//    通过继承构造太空飞船

//    但此时SpaceShip中包含SpaceShipControls，SpaceShipControls的所有
//    方法都在SpaceShip中暴露了出来


    private String name;
    public SpaceShip(String name) { this.name = name; }
    public String toString() { return name; }
    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
