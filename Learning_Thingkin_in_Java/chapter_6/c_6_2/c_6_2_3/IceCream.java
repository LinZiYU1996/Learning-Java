package chapter_6.c_6_2.c_6_2_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:20 2019/12/26
 */
public class IceCream {

//    private关键字表示除以下类之外，没有人可以访问该成员：
//    在该类的方法内部包含该成员。 同一包中的其他类不能
//    访问私人成员，就好像您在使班级与自己隔绝一样。 在
//    另一方面，由多个人协作创建软件包的可能性不大
//    一起使用，因此private允许您自由更改该成员，而无需担心它将
//    影响同一包中的另一个类。

    public static void main(String[] args) {
//         Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }


//    这显示了一个示例，其中private派上了用场：您可能想控制
//    对象被创建并阻止某人直接访问特定的构造函数（或所有
//    其中）。 在前面的示例中，您无法通过其构造函数创建Sundae对象。
//    相反，您必须调用makeASundae（）方法来为您执行此操作。



}
