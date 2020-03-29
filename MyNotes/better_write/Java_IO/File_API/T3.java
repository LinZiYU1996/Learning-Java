package better_write.Java_IO.File_API;

import java.io.File;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 12:51
 * \* Description:
 * \
 */
public class T3 {

//修改权限
//
//boolean setExecutable(boolean executable) 设置此抽象路径名所有者执行权限的一个便捷方法。
//
//boolean setExecutable(boolean executable, boolean ownerOnly) 设置此抽象路径名的所有者或所有用户的执行权限。
//
//boolean setLastModified(long time) 设置此抽象路径名指定的文件或目录的最后一次修改时间。
//
//boolean setReadable(boolean readable) 设置此抽象路径名所有者读权限的一个便捷方法。
//
//boolean setReadable(boolean readable, boolean ownerOnly) 设置此抽象路径名的所有者或所有用户的读权限。
//
//boolean setReadOnly() 标记此抽象路径名指定的文件或目录，从而只能对其进行读操作。
//
//boolean setWritable(boolean writable) 设置此抽象路径名所有者写权限的一个便捷方法。
//
//boolean setWritable(boolean writable, boolean ownerOnly) 设置此抽象路径名的所有者或所有用户的写权限。



    public static void main(String[] args) {

            test8();

    }

    /**
     * 修改文件/文件夹的权限
     *
     * file.setExecutable(executable) 修改文件是否可执行的方法  有问题  win下不可改
     */
    public static void test8(){
        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\File_API\\a.txt");

        System.out.println("文件修改前的属性：--------------------");

        System.out.println("查看文件是否可读：" + file.canRead());
        System.out.println("查看文件是否可写：" + file.canWrite());
        System.out.println("查看文件是否可执行：" + file.canExecute());


        //修改为 不可读、不可写、不可执行
        file.setReadable(false);
        file.setWritable(false);
        file.setExecutable(false);
        System.out.println("文件修改后的属性：--------------------");

        System.out.println("查看文件是否可读：" + file.canRead());
        System.out.println("查看文件是否可写：" + file.canWrite());
        System.out.println("查看文件是否可执行：" + file.canExecute());
    }
}
