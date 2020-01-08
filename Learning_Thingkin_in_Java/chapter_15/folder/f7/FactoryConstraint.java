package chapter_15.folder.f7;

import chapter_15.c_15_7.c_15_7_3.Foo;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:12
 * \* Description:
 * \
 */
public class FactoryConstraint {

    public static void main(String[] args) {

        new Foo2<Integer>(new IntegerFactory());

        new Foo2<Widget>(new Widget.Factory());



    }
}
