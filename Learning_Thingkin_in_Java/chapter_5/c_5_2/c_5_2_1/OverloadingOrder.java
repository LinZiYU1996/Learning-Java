package chapter_5.c_5_2.c_5_2_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:13 2019/12/24
 */
public class OverloadingOrder {


//    若方法有同样的名字，Java 怎样知道我们指的哪一个方法呢？这里有一个简单的规则：每个过载的方法都必
//    须采取独一无二的自变量类型列表。
//    若稍微思考几秒钟，就会想到这样一个问题：除根据自变量的类型，程序员如何区分两个同名方法的差异
//    呢？
//    即使自变量的顺序也足够我们区分两个方法（尽管我们通常不愿意采用这种方法，因为它会产生难以维护的代码）

    static void print(String s, int i) {
        System.out.println(
                "String: " + s +
                        ", int: " + i);
    }
    static void print(int i, String s) {
        System.out.println(
                "int: " + i +
                        ", String: " + s);
    }
    public static void main(String[] args) {

//        两个print()方法有完全一致的自变量，但顺序不同，可据此区分它们。
//
        print("String first", 11);
        print(99, "Int first");
    }


}
