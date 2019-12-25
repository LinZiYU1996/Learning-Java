package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:28 2019/12/25
 */
public class OptionalTrailingArguments {


//    这也显示了如何使用除Object之外的指定类型的varargs。 在这里，所有
//    变量必须是String对象。 可以在varargs中使用任何类型的参数，
//    包括原始类型。


    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for(String s : trailing)
            System.out.print(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }



}
