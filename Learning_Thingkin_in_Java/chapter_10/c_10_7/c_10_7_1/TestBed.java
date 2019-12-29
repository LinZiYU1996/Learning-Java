package chapter_10.c_10_7.c_10_7_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:51 2019/12/29
 */
public class TestBed {

    public void f() { System.out.println("f()"); }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }


}
