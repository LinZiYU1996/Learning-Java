package chapter_7.c_7_8.c_7_8_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:36 2019/12/26
 */

//! class Further extends Dinosaur {}
// error: Cannot extend final class ‘Dinosaur’
public class Jurassic {

    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }


}
