package better_write.Learn_reflection.A2;

import java.lang.reflect.Constructor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 21:22
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws NoSuchMethodException {


        Class<?> class_ = Data.class;


        Constructor constructor = class_.getConstructor(int.class);

        System.out.println(constructor);

        System.out.println("------------");

        for (Constructor c:class_.getConstructors()) {
            System.out.println(c);
            //public better_write.Learn_reflection.A2.Data(int,double,java.lang.String,float,char)
            //public better_write.Learn_reflection.A2.Data(float,char)
            //public better_write.Learn_reflection.A2.Data()
            //public better_write.Learn_reflection.A2.Data(int,double,java.lang.String)
        }

        System.out.println("------------");

        for (Constructor c : class_.getDeclaredConstructors()) {
            System.out.println(c);
            //private better_write.Learn_reflection.A2.Data(double,java.lang.String,float)
            //public better_write.Learn_reflection.A2.Data(int,double,java.lang.String,float,char)
            //public better_write.Learn_reflection.A2.Data(float,char)
            //public better_write.Learn_reflection.A2.Data()
            //public better_write.Learn_reflection.A2.Data(int,double,java.lang.String)
            //public better_write.Learn_reflection.A2.Data(int)
        }

        System.out.println("------------");

    }
}
