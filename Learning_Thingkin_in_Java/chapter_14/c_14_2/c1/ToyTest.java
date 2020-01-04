package chapter_14.c_14_2.c1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:51 2020/1/4
 */


public class ToyTest {


//    printInfo使用getName()来产生全限定的类名，
//    并分别使用getSiinpleName()和 getCanonicalName()
//    (在Ja俨vaSES中引入的）来产茬习不含包名的类名和全限定的类名。
//    islnterfaceO方法如同其名，可以告诉你这个Class对象是否表示某个接口。
//    因此，通过Class对 象，你可以发现你想要了解的类型的所有信息。
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {

//        forName方法在适当的try语句块中，创建了一个Class引用，
//        井将其初始化为指向FancyToy Class。
//        注意，在传递给forNameO的字符串中，你必须使用全限定名（包含包名）。
        Class c = null;
        try {
            c = Class.forName("chapter_14.c_14_2.c1.FancyToy");
        } catch(ClassNotFoundException e) {
            print("Can’t find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        System.out.println("_________________________________________");

//        在main()中调用的Class.getlnterfaces()方法返回的是Class对象，
//        它们表示在感兴趣的Class 对象中所包含的接口。
        for(Class face : c.getInterfaces())
            printInfo(face);
            System.out.println("_________________________________________");

//            如果你有一个Class对象，还可以使用getSuperclassO方法查询其直接基类，
//            这将返回你可以用来进一步查询的Class对象。
//            因此，你可以在运行时发现一个对象完整的类继承结构。
        Class up = c.getSuperclass();
        Object obj = null;
        try {
// Requires default constructor:

//            Class的newInstance()方法是实现“虚拟构造器”的一种途径，
//            虚拟构造器允许你声明： “我不知道你的确切类型，但是无论如何要正确地创建你自己。”
//            在前面的示例中，up仅仅只是 一个Class引用，在编译期不具备任何更进一步的类型信息。
//            当你创建新实例时，会得到Object 引用，但是这个引用指向的是Toy对象。
            obj = up.newInstance();


        } catch(InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }


}
