package chapter_15.c_15_8.c_15_8_1.d;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:28 2020/1/6
 */
public class Widget {

    public static class Factory implements FactoryI<Widget> {
        public Widget create() {
            return new Widget();
        }
    }


}
