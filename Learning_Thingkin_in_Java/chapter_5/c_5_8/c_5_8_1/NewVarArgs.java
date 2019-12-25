package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:25 2019/12/25
 */
public class NewVarArgs {


    static void printArray(Object... args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
// Can take individual elements:
        printArray(new Integer(47), new Float(3.14),
                new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
// Or an array:
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray(); // Empty list is OK

    }

//    使用varargs，您不再需要显式写出数组语法-编译器将
//    指定varargs时，实际为您填写。 您仍然得到一个数组，这就是为什么
//    print（）能够使用foreach遍历数组。 但是，不只是
//    自动从元素列表转换为数组。 请注意，
//    程序，其中将整数数组（使用自动装箱创建）强制转换为对象数组（
//    删除编译器警告）并传递给printArray（）。 显然，编译器认为
//    这已经是一个数组，并且不对其执行任何转换。 因此，如果您有一组物品，
//    可以将它们作为列表传递，如果您已经有一个数组，它将接受它作为变量
//    参数列表。


//    该程序的最后一行显示，可以将零个参数传递给vararg列表。
//    当您有可选的尾随参数时，这将很有帮助
}
