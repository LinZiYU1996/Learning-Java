package jvm.oracleDocument;

import java.util.HashSet;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 14:39
 * \* Description:
 * \
 */
public class T1 {

    //Retrieving Class Objects
    //The entry point for all reflection operations is java.lang.Class.
    // With the exception of java.lang.reflect.ReflectPermission,
    // none of the classes in java.lang.reflect have public constructors.
    // To get to these classes, it is necessary to invoke appropriate methods on Class. There are several ways to get a
    // Class depending on whether the code has access to an object, the name of class, a type, or an existing Class.

    //Object.getClass()

    //If an instance of an object is available,
    // then the simplest way to get its Class is to invoke Object.getClass().
    // Of course, this only works for reference types which all inherit from
    // Object. Some examples follow.


    public static void main(String[] args) {


        //Returns the Class for String
        Class c = "Foo".getClass();

        System.out.println(
                c
        );


        System.out.println("------------");

        //There is a unique console associated with the virtual
        // machine which is returned by the static method System.console().
        // The value returned by getClass() is the Class corresponding to
        // java.io.Console.
//        Class c1 = System.console().getClass();

//        System.out.println(c1);

        System.out.println("------------");

        //A is is an instance of the enum E; thus getClass() returns the Class corresponding to the enumeration type E.
        Class c2 = E.A.getClass();

        System.out.println(c2);

        System.out.println("------------");

        //Since arrays are Objects,
        // it is also possible to invoke getClass() on an instance of an array.
        // The returned Class corresponds to an array with component type byte.
        byte[] bytes = new byte[1024];

        Class c3 = bytes.getClass();

        System.out.println(c3);

        System.out.println("------------");


        //In this case, java.util.Set is an interface to an object of type
        // java.util.HashSet. The value returned by getClass() is the class
        // corresponding to java.util.HashSet.
        Set<String> s = new HashSet<String>();
        Class c4 = s.getClass();

        System.out.println(c4);
    }


}
