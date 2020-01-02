package chapter_11.chapter_11_1.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:32 2020/1/2
 */
public class Chinese extends People{

    private String string;

    public Chinese() {
        this.string = "Chinese";
    }

    @Override
    void where() {
        System.out.println(string);
    }
}
