package C_1.c_1_9;

import java.util.HashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 22:54
 * \* Description:
 * \
 */


// 类A的equals方法总是返回true，但没有重写其hashCode()方法
class A
{
    private String name;

    public A(String name) {
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        return true;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}


// 类B的hashCode()方法总是返回1，但没有重写其equals()方法
class B
{
    private String name;

    public B(String name) {
        this.name = name;
    }

    public int hashCode()
    {
        return 1;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
}



// 类C的hashCode()方法总是返回2，且重写其equals()方法总是返回true
class C
{
    private String name;

    public C(String name) {
        this.name = name;
    }

    public int hashCode()
    {
        return 2;
    }
    public boolean equals(Object obj)
    {
        return true;
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class HashSetTest
{
    public static void main(String[] args)
    {
        HashSet books = new HashSet();
        // 分别向books集合中添加两个A对象，两个B对象，两个C对象
        books.add(new A("a1"));
        books.add(new A("a2"));
        books.add(new B("b1"));
        books.add(new B("b2"));
        books.add(new C("c1"));
        books.add(new C("c2"));
        System.out.println(books);
    }
}