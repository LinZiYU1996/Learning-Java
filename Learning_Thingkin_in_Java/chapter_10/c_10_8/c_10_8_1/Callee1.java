package chapter_10.c_10_8.c_10_8_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:58 2019/12/29
 */
class Callee1 implements Incrementable{
    private int i = 0;
    @Override
    public void increment() {
        i++;
        print(i);
    }
}
