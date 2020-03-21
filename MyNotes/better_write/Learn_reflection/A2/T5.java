package better_write.Learn_reflection.A2;

import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 22:29
 * \* Description:
 * \
 */
public class T5 {


    public static void main(String[] args) {

        Class<?> class_ = Data.class;

        for (Method m : class_.getMethods()) {

            System.out.println(m.getName());
            System.out.println("");
            System.out.println(m.getDeclaringClass());
            System.out.println("");
            System.out.println(m.getModifiers());
            System.out.println("");
            for (Class cc : m.getParameterTypes()) {
                System.out.println("para : " + cc);
            }
            System.out.println("---------------------");


        }

    }
}


/*

m1

class better_write.Learn_reflection.A2.Data

9

para : int
para : int
---------------------
m5

class better_write.Learn_reflection.A2.Data

1

---------------------
wait

class java.lang.Object

17

---------------------
wait

class java.lang.Object

17

para : long
para : int
---------------------
wait

class java.lang.Object

273

para : long
---------------------
equals

class java.lang.Object

1

para : class java.lang.Object
---------------------
toString

class java.lang.Object

1

---------------------
hashCode

class java.lang.Object

257

---------------------
getClass

class java.lang.Object

273

---------------------
notify

class java.lang.Object

273

---------------------
notifyAll

class java.lang.Object

273

---------------------

 */
