package jvm.oracleDocument;

import java.lang.reflect.Field;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 14:54
 * \* Description:
 * \
 */
public class T5 {


    /*
    Methods that Return Classes

     */

    //There are several Reflection APIs which return classes but these may only be accessed if a Class has already been obtained either directly or indirectly.
    public static void main(String[] args) throws NoSuchFieldException {

/*
Class.getSuperclass()
Returns the super class for the given class.
 */
        Class c = javax.swing.JButton.class.getSuperclass();

        //The super class of javax.swing.JButton is javax.swing.AbstractButton.
        System.out.println(c);

        //class javax.swing.AbstractButton

        System.out.println("-----------------------------------------");
/*
Class.getClasses()
Returns all the public classes, interfaces,
and enums that are members of the class including inherited members.
 */

//Character contains two member classes Character.Subset and Character.UnicodeBlock.
        Class<?>[] c1 = Character.class.getClasses();

        System.out.println(c1.toString());
        //[Ljava.lang.Class;@1b6d3586

        for (int i = 0; i < c1.length; i++) {
            System.out.println(c1[i]);
        }

        //class java.lang.Character$Subset
        //class java.lang.Character$UnicodeBlock
        //class java.lang.Character$UnicodeScript

        System.out.println("-----------------------------------------");



/*
Class.getDeclaredClasses()
Returns all of the classes interfaces,
 and enums that are explicitly declared in this clas
 */


//Character contains two public member classes Character.Subset and Character.UnicodeBlock and one private class Character.CharacterCache.
        Class<?>[] c2 = Character.class.getDeclaredClasses();


        for (int i = 0; i < c2.length; i++) {
            System.out.println(c2[i]);
        }

        //class java.lang.Character$CharacterCache
        //class java.lang.Character$Subset
        //class java.lang.Character$UnicodeBlock
        //class java.lang.Character$UnicodeScript


        System.out.println("-----------------------------------------");

/*
Class.getDeclaringClass()
java.lang.reflect.Field.getDeclaringClass()
java.lang.reflect.Method.getDeclaringClass()
java.lang.reflect.Constructor.getDeclaringClass()
Returns the Class in which these members were declared. Anonymous Class Declarations will not have a declaring class but will have an enclosing class.
 */
        //The field out is declared in System.
        Field f = System.class.getField("out");
        Class c3 = f.getDeclaringClass();

        System.out.println(c3);
        //class java.lang.System

        System.out.println("-----------------------------------------");

//        Class c4 = Thread.State.class().getEnclosingClass();



    }
}
