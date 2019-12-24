package chapter_5.c_5_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:10 2019/12/24
 */
public class Overloading {
//    Tree 既可创建成一颗种子，不含任何自变量；亦可创建成生长在苗圃中的植物。为支持这种创建，共使用了
//    两个构建器，一个没有自变量（我们把没有自变量的构建器称作“默认构建器”，注释①），另一个采用现
//    成的高度。
//我们也有可能希望通过多种途径调用info()方法。例如，假设我们有一条额外的消息想显示出来，就使用
//    String自变量；而假设没有其他话可说，就不使用。由于为显然相同的概念赋予了两个独立的名字，所以看
//    起来可能有些古怪。幸运的是，方法过载允许我们为两者使用相同的名字。
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
// Overloaded constructor:
        new Tree();
    }
}
