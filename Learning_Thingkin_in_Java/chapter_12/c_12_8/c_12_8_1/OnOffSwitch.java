package chapter_12.c_12_8.c_12_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:33 2020/1/3
 */
public class OnOffSwitch {

    private static Switch sw = new Switch();
    public static void f()
            throws OnOffException1,OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
// Code that can throw exceptions...
            f();
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }



}
