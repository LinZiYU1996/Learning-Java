package better_write.Java_IO.File_API;

import java.io.File;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 12:00
 * \* Description:
 * \
 */
public class T1 {

    //File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
    //
    //File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
    //
    //File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
    //
    //File(URI uri) 通过将给定的 file: URI 转换为一个抽象路径名来创建一个新的 File 实例。


    public static void main(String[] args) {
        //File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        File f1 =new File("../test.txt");

        //File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        File f2 =new File(f1,"test.txt");

        //File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        File f3 =new File("src","test.txt");

        //跨平台的路径
        //separator方法会自动获取不同平台的分隔符
        File f4 =new File(File.separator + "src");

        //win   下是   '\'
        //linux 下是  '/'
        System.out.println(f4);



    }
}
