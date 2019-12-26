package chapter_7.c_7_4.c_7_4_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:15 2019/12/26
 */
public class Hide {

    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
