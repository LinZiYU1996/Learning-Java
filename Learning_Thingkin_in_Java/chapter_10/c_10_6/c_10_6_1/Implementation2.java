package chapter_10.c_10_6.c_10_6_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:43 2019/12/29
 */
class Implementation2 implements Service{

    private Implementation2() {}
    public void method1() {print("Implementation2 method1");}
    public void method2() {print("Implementation2 method2");}
    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementation2();
                }
            };
}
