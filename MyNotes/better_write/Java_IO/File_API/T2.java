package better_write.Java_IO.File_API;

import java.io.File;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 12:02
 * \* Description:
 * \
 */
public class T2 {

//boolean createNewFile() 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
//
//boolean mkdir() 创建此抽象路径名指定的目录。
//
//boolean mkdirs() 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。



    public static void main(String[] args) {

        test1();

        test2();

        test3();

    }

    /**
     * 新建一个文件
     */
    public static void test1(){
        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\File_API\\a.txt");
        try {

            /*
             * @return  <code>true</code> if the named file does not exist and was
             *          successfully created; <code>false</code> if the named file
             *          already exists
             */
            System.out.println("创建文件：" + file.createNewFile());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 新建一个文件夹
     */
    public static void test2(){

        /*
         * @return  <code>true</code> if and only if the directory was
         *          created; <code>false</code> otherwise
         */
        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\File_API\\a");
        System.out.println("创建文件夹：" + file.mkdir());
    }


    /**
     * 新建一个多级文件夹
     */
    public static void test3(){
        File file = new File("newDir/1/2/3");

        /*
         * Creates the directory named by this abstract pathname, including any
         * necessary but nonexistent parent directories.  Note that if this
         * operation fails it may have succeeded in creating some of the necessary
         * parent directories.
         *
         *      * @return  <code>true</code> if and only if the directory was created,
         *          along with all necessary parent directories; <code>false</code>
         *          otherwise
         *
         */
        System.out.println("创建多级文件夹：" + file.mkdirs());
    }
}
