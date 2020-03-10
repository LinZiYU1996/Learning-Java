package Effective.P14;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/10
 * \* Time: 21:26
 * \* Description:
 * \
 */
public class Person_ implements Comparable<Person_>{

    private String name;
    private int age;

    public Person_(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person_ o) {
        if (age > o.age)
            return 1;
        if (age < o.age)
            return -1;

        /*
                //若年龄相等，则直接通过名字来进行排序。

         */
        return name.compareTo(o.name);
    }



    @Override
    public String toString() {
        return "name: " + name + "  age: " + age;
    }

}
