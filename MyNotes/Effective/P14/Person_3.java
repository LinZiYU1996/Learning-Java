package Effective.P14;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/10
 * \* Time: 21:29
 * \* Description:
 * \
 */
public class Person_3 implements Comparable<Person_3>{
/*
再度升级，如果为Person类添加一个id属性，并要求先按id升序，若id相同，则按年龄降序，若id和age都相同，则按name升序。


 */

    private int id;
    private String name;
    private int age;

    public Person_3(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person_3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person_3 o) {
        if (id > o.id)
            return 1;
        if (id < o.id)
            return -1;
        //id相等的情况下，对age进行排序
        if (age > o.age)
            return -1;
        if (age < o.age)
            return 1;
        //若id和age相等，则直接通过名字来进行排序。
        return name.compareTo(o.name);
    }
}
