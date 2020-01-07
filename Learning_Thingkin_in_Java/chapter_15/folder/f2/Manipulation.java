package chapter_15.folder.f2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:12 2020/1/7
 */
public class Manipulation {

    public static void main(String[] args) {

        HasF hasF = new HasF();

        Manipulator<HasF> manipulator =
                new Manipulator<>(hasF);

        manipulator.manipulator();



    }
}
