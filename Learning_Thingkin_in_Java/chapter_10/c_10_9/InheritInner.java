package chapter_10.c_10_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:33 2020/1/1
 */
public class InheritInner extends WithInner.Inner{

    //! InheritInner() {} // Won’t compile
    InheritInner(WithInner wi) {
        wi.super();
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
