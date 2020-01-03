package chapter_12.c_12_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:49 2020/1/3
 */
public class InheritingExceptions {

    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch(SimpleException e) {
            System.out.println("Caught it!");
        }
    }


}
