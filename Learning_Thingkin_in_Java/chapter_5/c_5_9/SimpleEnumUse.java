package chapter_5.c_5_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:41 2019/12/25
 */
public class SimpleEnumUse {


//    要使用枚举，请创建该类型的引用并将其分配给实例：
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
    }

//    创建枚举时，编译器会自动添加有用的功能。 例如，它
//    创建一个toString（），以便您可以轻松显示枚举实例的名称，即
//    上面的打印语句如何产生输出。 编译器还会创建一个ordinal（）
//    指示特定枚举常量的声明顺序的方法，以及一个静态
//    values（）方法，该方法按以下顺序生成枚举常量的值数组：
//    他们被宣布：
}
