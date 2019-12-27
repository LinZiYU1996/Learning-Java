package chapter_8.c_8_2.c_8_2_2;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:52 2019/12/27
 */
public class RandomShapeGenerator {

    private Random rand = new Random(47);

//    向上转型是在return语句发生的，每个return语句获得一个指向具体图形的引用
//    并将其以Shape类型从next方法中发生出去
//    所以无论什么时候调用next方法，我们都不可能知道具体类型到底是什么
//    因为我们获取的是一个通用的Shape引用
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }


}
