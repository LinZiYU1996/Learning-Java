package book_jvm.P7;

import java.io.IOException;
import java.io.InputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/14
 * \* Time: 20:12
 * \* Description:
 * \
 */
public class ClassLoaderTest {


    /*

    不同的类加载器对instanceof关键字运算的结果的影响


     */
    public static void main(String[] args) throws ClassNotFoundException {


        ClassLoader my = new ClassLoader() {


            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {

                try {

                    String fileName = name.substring(
                            name.lastIndexOf(".")+ 1
                    ) + ".class";

                    InputStream is = getClass().getResourceAsStream(fileName);

                    if (is == null) {
                        return super.loadClass(name);
                    }

                    byte[] b = new byte[is.available()];

                    is.read(b);

                    return defineClass(name,b,0,b.length);

                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }

            }
        };


        Object o = my.loadClass("book_jvm.P7.ClassLoaderTest");

        System.out.println(o.getClass());

        System.out.println(

                o instanceof  book_jvm.P7.ClassLoaderTest

        );


    }
}
