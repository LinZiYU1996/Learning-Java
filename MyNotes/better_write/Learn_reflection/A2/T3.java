package better_write.Learn_reflection.A2;

import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/20
 * \* Time: 22:05
 * \* Description:
 * \
 */
public class T3 {


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {


        Class<?> class_ = Data.class;

        for (Method m : class_.getMethods()) {
            System.out.println(m);
            //public static int better_write.Learn_reflection.A2.Data.m1(int,int)
            //public final void java.lang.Object.wait() throws java.lang.InterruptedException
            //public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
            //public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
            //public boolean java.lang.Object.equals(java.lang.Object)
            //public java.lang.String java.lang.Object.toString()
            //public native int java.lang.Object.hashCode()
            //public final native java.lang.Class java.lang.Object.getClass()
            //public final native void java.lang.Object.notify()
            //public final native void java.lang.Object.notifyAll()
        }

        System.out.println("--------------------------------------------");

        Method m1 = class_.getMethod("m1", int.class, int.class);
        //public static int better_write.Learn_reflection.A2.Data.m1(int,int)
        System.out.println(m1);

        System.out.println("--------------------------------------------");

        Method m2 = class_.getMethod("m5");
        //public void better_write.Learn_reflection.A2.Data.m5()

        System.out.println(m2);

        class_.newInstance();
    }
}
