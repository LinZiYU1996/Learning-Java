package chapter_14.c_14_2.c_14_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:57 2020/1/4
 */
public class GenericClassReferences {

    public static void main(String[] args) {

        Class intClass = int.class;

        Class<Integer> genericIntClass = int.class;

        genericIntClass = Integer.class; // Same thing

        //没有泛型的约束,可以随意赋值
        intClass = double.class;

// genericIntClass = double.class; // Illegal

//        普通的类引用不会产生警告信息，你可以看到，尽管泛型类引用只能赋值为指向其声明的 类型，
//        但是普通的类引用可以被重新赋值为指向任何其他的qas􀁰对象。通过使用泛型语法，
//        可以让编译器强制执行额外的类型检查。
    }


}
