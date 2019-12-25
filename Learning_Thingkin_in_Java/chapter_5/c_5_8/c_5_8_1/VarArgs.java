package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:22 2019/12/25
 */
public class VarArgs {


//    可变参数列表
//
//    应用于参数个数或类型未知的场合
//
//    应为所有的类都直接或间接继承于Object
//
//    创建以Object数组为参数的方法

    static void printArray(Object[] args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "three" });
        printArray(new Object[]{new A(), new A(), new A()});
    }

//    您可以看到print（）接受了一个Object数组，然后使用
//    foreach语法并打印每个语法。 标准的Java库类产生合理的结果
//    输出，但此处创建的类的对象将打印类名称，后跟“ @”
//    符号和十六进制数字。 因此，这是默认行为（如果您未定义toString（）
//    类的方法（将在本书的后面部分进行介绍）是打印类名
//    和对象的地址。

}
