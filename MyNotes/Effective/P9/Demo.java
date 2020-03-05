package Effective.P9;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/5
 * \* Time: 17:19
 * \* Description:
 * \
 */
public class Demo {


    // 简单示例
    static String fistLineOfFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
            return "null";
        }

    }


    /*
    我们一般在关闭资源的时候都会选用try-finally,比如关闭各种读写流，数据库连接对象等，都会在finally中调用对象的close方法，即使发生异常也会确保资源被释放，这看上去没有什么问题。
但是再添加另一个资源，就会显的乱七八糟的感觉，如下是文件拷贝代码示例。
     */

    public static void copy(String src,String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[1024];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf,0,n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    /*
    在上面的代码示例中有两个缺点
1.关闭的资源多了，try-finally就嵌套的多了，代码感觉很乱。
2.try和finally中都会抛出异常，如果底层物理设备异常，那么try中流在读文件的过程中就会有异常，同样finally中流close的时候也会发生异常，这种情况下，close中的异常就会覆盖try中的异常，try中的异常甚至都没有打印出错误堆栈，显然try中的异常才是对我们有价值的异常。
所以为了避免上述的问题，我们应该使用java7中引用的try-with-resource语句，上面的两个问题就不会存在了，要关闭资源的类必须实现AutoCloseable接口，包含无返回值的close方法，现在java中的很多类库都实现了这个接口。

     */

    public static void copy_1(String src, String dst) throws IOException {

        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst);) {
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }

    /*
    现在第一个代码就变成了这样，将要关闭的资源放在了try后面的括号里面，自己就会在用完的时候释放资源，而且如果发生异常也是会打印出第一个异常，close里面的异常就会被禁止，我们就可以找到对我们有用的异常。
     */



/*
结论很明显： 在处理必须关闭的资源时，始终要优先考虑用try- with-resources ，而不是
用try-finally 。这样得到的代码将更加简洁、清晰，产生的异常也更有价值。有了trywith-
resources 语句，在使用必须关闭的资源时，就能更轻松地正确编写代码了。实践证明，
这个用try-finally 是不可能做到的

 */

}
