package jvm.oracleDocument;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 14:50
 * \* Description:
 * \
 */
public class T3 {

//Class.forName()


    //If the fully-qualified name of a class is available, it is possible to get the corresponding Class using the static method Class.forName().
    // This cannot be used for primitive types. The syntax for names of array classes is described by Class.getName().
    // This syntax is applicable to references and primitive types.


    public static void main(String[] args) throws ClassNotFoundException {

        //This statement will create a class from the given fully-qualified name.
        Class c = Class.forName("jvm.oracleDocument.Foo");

        System.out.println(c);

        System.out.println("---------------------------------");


        //The variable cDoubleArray will contain the Class corresponding to an array of primitive type double (i.e. the same as double[].class).
        // The cStringArray variable will contain the Class corresponding to a two-dimensional array of String (i.e. identical to String[][].class).
        Class cDoubleArray = Class.forName("[D");

        Class cStringArray = Class.forName("[[Ljava.lang.String;");

        System.out.println(cDoubleArray);

        System.out.println(cStringArray);

        /*
        class [D
        class [[Ljava.lang.String;
         */
        System.out.println("---------------------------------");


    }
}
