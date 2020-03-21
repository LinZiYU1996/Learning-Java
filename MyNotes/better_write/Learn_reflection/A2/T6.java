package better_write.Learn_reflection.A2;

import java.lang.reflect.Field;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 22:32
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        Class<?> class_ = Data.class;

        for (Field f : class_.getFields()) {

            System.out.println(f.getName());
            System.out.println("");
            System.out.println(f.getDeclaringClass());
            System.out.println("");
            System.out.println(f.getType());
            System.out.println("");
            System.out.println("-------------------------");
        }

        System.out.println("********");
        Data data = (Data) class_.newInstance();
        Field f1 = class_.getField("string");
        f1.set(data,"ass");

        System.out.println(data.getString());

        System.out.println(f1.get(data));
    }
}

/*
string

class better_write.Learn_reflection.A2.Data

class java.lang.String

-------------------------
aShort

class better_write.Learn_reflection.A2.Data

short

-------------------------
 */