package jvm.oracleDocument.A2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 15:37
 * \* Description:
 * \
 */
public class ClassTrouble {


    public static void main(String... args) {
        try {
            Class<?> c = Class.forName("jvm.oracleDocument.A2.Cls");
            c.newInstance();  // InstantiationException

            // production code should handle these exceptions more gracefully
        } catch (InstantiationException x) {
            x.printStackTrace();
        } catch (IllegalAccessException x) {
            x.printStackTrace();
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }

        /*
        java.lang.IllegalAccessException: Class jvm.oracleDocument.A2.ClassTrouble can not access a member of class jvm.oracleDocument.A2.Cls with modifiers "private"
	at sun.reflect.Reflection.ensureMemberAccess(Reflection.java:102)

         */

        /*
        Class.newInstance() behaves very much like the new keyword and will fail for the same reasons new would fail.
        The typical solution in reflection is to take advantage of the java.lang.reflect.AccessibleObject class
         which provides the ability to suppress access control checks; however, this approach will not work because java.lang.Class
         does not extend AccessibleObject. The only solution is to modify the code to use Constructor.newInstance() which does extend AccessibleObject.
         */

        /*
        Tip: In general, it is preferable to use Constructor.newInstance() for the reasons described in the Creating New Class Instances section in the Members lesson.
Additional examples of potential problems using Constructor.newInstance() may be found in the Constructor Troubleshooting section of the Members lesson.
         */
    }


}
