package chapter_5.c_5_7.c_5_7_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 18:58 2019/12/25
 */
public class House {

    Window w1 = new Window(1); // Before constructor
    House() {
// Show that we’re in the constructor:
        System.out.println("House()");
        w3 = new Window(33); // Reinitialize w3
    }
    Window w2 = new Window(2); // After constructor
    void f() {
        System.out.println("f()"); }
    Window w3 = new Window(3); // At end


}
