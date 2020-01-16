package C_2.c_2_1;

import java.util.TreeSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 10:31
 * \* Description:
 * \
 */
class M
{
    int age;
    public M(int age)
    {
        this.age = age;
    }
    public String toString()
    {
        return "M [age:" + age + "]";
    }
}
public class TreeSetTest4
{
    public static void main(String[] args)
    {
        // 此处Lambda表达式的目标类型是Comparator
        TreeSet ts = new TreeSet((o1 , o2) ->
        {
            M m1 = (M)o1;
            M m2 = (M)o2;
            // 根据M对象的age属性来决定大小，age越大，M对象反而越小
            return m1.age > m2.age ? -1
                    : m1.age < m2.age ? 1 : 0;
        });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
    }
}