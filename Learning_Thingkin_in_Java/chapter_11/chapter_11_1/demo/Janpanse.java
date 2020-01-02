package chapter_11.chapter_11_1.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:33 2020/1/2
 */
public class Janpanse extends People{

    private String string;

    public Janpanse() {
        this.string = "Janpanse";
    }

    @Override
    void where() {
        System.out.println(string);
    }
}
