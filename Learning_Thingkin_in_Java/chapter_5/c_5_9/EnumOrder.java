package chapter_5.c_5_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:43 2019/12/25
 */
public class EnumOrder {

    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }

//    尽管枚举似乎是一种新的数据类型，但关键字仅产生一些编译器
//    行为，同时为枚举生成一个类，因此可以通过多种方式将枚举视为
//    如果是其他班级的话。 实际上，枚举是类，并且具有自己的方法。

}
