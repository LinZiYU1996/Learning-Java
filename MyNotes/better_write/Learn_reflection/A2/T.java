package better_write.Learn_reflection.A2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 21:03
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) throws ClassNotFoundException {

        //Object.getClass()

        String s = "test";

        Class<?> class_ = s.getClass();

        System.out.println(class_);

        //输出
        //class java.lang.String

        System.out.println("-------------------------------");

        //T.class

        Class<?> class_1 = Double.class;

        System.out.println(class_1);

        //输出
        //class java.lang.Double

        System.out.println("-------------------------------");

//        /Class.forName

        Class<?> class_2 = Class.forName("java.lang.Character");

        System.out.println(class_2);

        //输出
        //class java.lang.Character

        System.out.println("-------------------------------");


        //TYPE语法

        Class<?> classType = Boolean.TYPE;
        System.out.println(classType);
        // 输出
        //boolean

//        Type

    }
}
