package chapter_6.c_6_2.c_6_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:19 2019/12/26
 */
public class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }

//    您最初可能将它们视为完全外部文件，但是Cake可以创建Pie
//    对象并调用其f（）方法。 （请注意，您必须在CLASSPATH中添加“。”
//    您通常会认为Pie和f（）具有程序包访问权限，并且
//    因此不适用于Cake。 他们确实具有软件包访问权限-该部分是正确的。 的
//    它们在Cake.java中可用的原因是因为它们在同一目录中，
//    没有明确的软件包名称。 Java将此类文件视为“默认值”的隐含部分
//    包”，以便它们提供对该目录中所有其他文件的包访问权限
//    目录。


}
