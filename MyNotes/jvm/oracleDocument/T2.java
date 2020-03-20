package jvm.oracleDocument;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 14:47
 * \* Description:
 * \
 */
public class T2 {


    //The .class Syntax

//If the type is available but there is no instance then it is possible to obtain a Class by appending
// ".class" to the name of the type. This is also the easiest way to obtain the Class for a primitive type.
    public static void main(String[] args) {


        //Note that the statement boolean.getClass() would produce a
        // compile-time error because a boolean is a primitive type and
        // cannot be dereferenced. The .class syntax returns the Class
        // corresponding to the type boolean.
        boolean b;
//        Class c = b.getClass();   // compile-time error

        Class c = boolean.class;  // correct

        System.out.println(c);

        System.out.println("----------------");


        //The variable c will be the Class corresponding to the type java.io.PrintStream.
        Class c1 = java.io.PrintStream.class;

        System.out.println(c1);

        System.out.println("----------------");


        //The .class syntax may be used to retrieve a
        // Class corresponding to a multi-dimensional array of a given type.


        Class c2 = int[][][].class;

        System.out.println(c2);



    }
}
