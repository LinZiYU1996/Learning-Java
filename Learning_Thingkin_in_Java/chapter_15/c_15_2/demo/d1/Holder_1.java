package chapter_15.c_15_2.demo.d1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:07 2020/1/7
 */
public class Holder_1 {

//    明确指定持有的对象
    private Apple apple;

    public Holder_1(Apple apple) {
        this.apple = apple;
    }

    public Apple getApple() {
        return apple;
    }
}
