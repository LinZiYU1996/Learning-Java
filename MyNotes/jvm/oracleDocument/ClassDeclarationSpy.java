package jvm.oracleDocument;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 15:01
 * \* Description:
 * \
 */
public class ClassDeclarationSpy {

/*
Examining Class Modifiers and Types
A class may be declared with one or more modifiers which affect its runtime behavior:

Access modifiers: public, protected, and private
Modifier requiring override: abstract
Modifier restricting to one instance: static
Modifier prohibiting value modification: final
Modifier forcing strict floating point behavior: strictfp
Annotations
Not all modifiers are allowed on all classes, for example an interface cannot be final and an enum cannot be abstract.
 java.lang.reflect.Modifier contains declarations for all possible modifiers. It also contains methods which may be used
 to decode the set of modifiers returned by Class.getModifiers().

The ClassDeclarationSpy example shows how to obtain the declaration components of a class including the modifiers,
 generic type parameters, implemented interfaces, and the inheritance path. Since Class implements the java.lang.reflect.AnnotatedElement
 interface it is also possible to query the runtime anno
 */
    public static void main(String... args) {

        /*
        需要手动 配置参数  选择一个 实验类
         */
        try {
            Class<?> c = Class.forName(args[0]);
            System.out.format("Class:%n  %s%n%n", c.getCanonicalName());
            System.out.format("Modifiers:%n  %s%n%n",
                    Modifier.toString(c.getModifiers()));

            System.out.format("Type Parameters:%n");
            TypeVariable[] tv = c.getTypeParameters();
            if (tv.length != 0) {
                System.out.format("  ");
                for (TypeVariable t : tv)
                    System.out.format("%s ", t.getName());
                System.out.format("%n%n");
            } else {
                System.out.format("  -- No Type Parameters --%n%n");
            }

            System.out.format("Implemented Interfaces:%n");
            Type[] intfs = c.getGenericInterfaces();
            if (intfs.length != 0) {
                for (Type intf : intfs)
                    System.out.format("  %s%n", intf.toString());
                System.out.format("%n");
            } else {
                System.out.format("  -- No Implemented Interfaces --%n%n");
            }

            System.out.format("Inheritance Path:%n");
            List<Class> l = new ArrayList<Class>();
            printAncestor(c, l);
            if (l.size() != 0) {
                for (Class<?> cl : l)
                    System.out.format("  %s%n", cl.getCanonicalName());
                System.out.format("%n");
            } else {
                System.out.format("  -- No Super Classes --%n%n");
            }

            System.out.format("Annotations:%n");
            Annotation[] ann = c.getAnnotations();
            if (ann.length != 0) {
                for (Annotation a : ann)
                    System.out.format("  %s%n", a.toString());
                System.out.format("%n");
            } else {
                System.out.format("  -- No Annotations --%n%n");
            }

            // production code should handle this exception more gracefully
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }

//        System.out.print();
//
//        System.out.print();
    }

    private static void printAncestor(Class<?> c, List<Class> l) {
        Class<?> ancestor = c.getSuperclass();
        if (ancestor != null) {
            l.add(ancestor);
            printAncestor(ancestor, l);
        }
    }
}
