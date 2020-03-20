package jvm.oracleDocument.A2;

import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 15:28
 * \* Description:
 * \
 */
public class ClassWarning {
/*
Troubleshooting
The following examples show typical errors which may be encountered when reflecting on classes.

Compiler Warning: "Note: ... uses unchecked or unsafe operations"
When a method is invoked, the types of the argument values are
checked and possibly converted. ClassWarning invokes getMethod() to cause a typical unchecked conversion warning:



 */
    public  void m() {
        try {
            Class c = ClassWarning.class;
            Method m = c.getMethod("m");  // warning

            // production code should handle this exception more gracefully
        } catch (NoSuchMethodException x) {
            x.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClassWarning classWarning = new ClassWarning();

        classWarning.m();

        /*
        java.lang.NoSuchMethodException: jvm.oracleDocument.A2.ClassWarning.m()
	at java.lang.Class.getMethod(Class.java:1786)
	at jvm.oracleDocument.A2.ClassWarning.m(ClassWarning.java:18)
	at jvm.oracleDocument.A2.ClassWarning.main(ClassWarning.java:29)
         */
    }
}
