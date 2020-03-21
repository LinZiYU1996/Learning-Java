package better_write.Learn_reflection.A2;

import java.lang.reflect.Field;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 21:53
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) throws NoSuchFieldException {

        Class<?> class_ = Data.class;

        for (Field f : class_.getFields()) {
            System.out.println(f);
            //public java.lang.String better_write.Learn_reflection.A2.Data.string
        }

        System.out.println("-----------------------------");

        Field f1 = class_.getField("aShort");
        //public short better_write.Learn_reflection.A2.Data.aShort


        System.out.println(f1);


    }

}
