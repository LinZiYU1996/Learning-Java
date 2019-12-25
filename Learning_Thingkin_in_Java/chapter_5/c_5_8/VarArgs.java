package chapter_5.c_5_8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:18 2019/12/25
 */
public class VarArgs {

    static void f(Object[] x) {
        for(int i = 0; i < x.length; i++)
            System.out.println(x[i]);
    }
    public static void main(String[] args) {
        f(new Object[] {
                new Integer(47), new VarArgs(),
                new Float(3.14), new Double(11.11) });
        f(new Object[] {"one", "two", "three" });
        f(new Object[] {new A(), new A(), new A()});
    }


}
