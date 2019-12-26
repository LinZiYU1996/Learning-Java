package chapter_6.c_6_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:02 2019/12/26
 */
public class FullQualification {


//    例如，有一个实用程序库是标准Java发行版的一部分，
//    在名称空间java.util下。 java.util中的类之一称为ArrayList。 单程
//    使用ArrayList的方法是指定全名java.util.ArrayList。
    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList();
    }

//    当您为Java创建源代码文件时，通常称为编译单元
//（有时是翻译单位）。 每个编译单元的名称都必须以.java结尾，
//    并且在编译单元内部可以有一个公共类，它必须与
//    文件（包括大写字母，但不包括.java文件扩展名）。 可以有
//    每个编译单元只有一个公共班级； 否则，编译器会抱怨。 如果
//    该编译单元中还有其他类，它们对外界隐藏
//    该软件包，因为它们不是公开的，并且包含主要的“支持”类
//            公开课

}
