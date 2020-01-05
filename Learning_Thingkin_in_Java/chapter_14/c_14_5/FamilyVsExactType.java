package chapter_14.c_14_5;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:57 2020/1/4
 */
public class FamilyVsExactType {


    static void test(Object x) {
        print("Testing x of type " + x.getClass());
        System.out.println("");

        print("x instanceof Base " + (x instanceof Base));
        System.out.println("");

        print("x instanceof Derived "+ (x instanceof Derived));
        System.out.println("");

        print("Base.isInstance(x) "+ Base.class.isInstance(x));
        System.out.println("");

        print("Derived.isInstance(x) " +
                Derived.class.isInstance(x));
        System.out.println("");

        System.out.println("___________________________________________");

        print("x.getClass() == Base.class " +
                (x.getClass() == Base.class));
        System.out.println("");

        print("x.getClass() == Derived.class " +
                (x.getClass() == Derived.class));
        System.out.println("");


        print("x.getClass().equals(Base.class)) "+
                (x.getClass().equals(Base.class)));
        System.out.println("");


        print("x.getClass().equals(Derived.class)) " +
                (x.getClass().equals(Derived.class)));
        System.out.println("");
    }
    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }


}
