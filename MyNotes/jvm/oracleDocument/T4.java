package jvm.oracleDocument;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 14:52
 * \* Description:
 * \
 */
public class T4 {

/*
TYPE Field for Primitive Type Wrappers

 */

//The .class syntax is a more convenient and the preferred way to obtain the Class for a primitive type; however there is another way to acquire the Class.
// Each of the primitive types and void has a wrapper class in java.lang that is used for boxing of primitive types to reference types.
// Each wrapper class contains a field named TYPE which is equal to the Class for the primitive type being wrapped.

    public static void main(String[] args) {
        //There is a class java.lang.Double which is used to wrap the primitive type double whenever an Object is required.
        // The value of Double.TYPE is identical to that of double.class.
        Class c = Double.TYPE;

        System.out.println(c);

        Class c1 = Void.TYPE;

        System.out.println(c1);




    }
}
