package chapter_10.c_10_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:41 2019/12/29
 */
public class DotNew {

    public class Inner {}
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }


}
