package better_write.Java_IO.Blog.A7.D;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 11:16
 * \* Description:
 * \
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -187877186941003078L;
    String name;
    int id;
    transient int age;   // transient   瞬时的，不持久化. 此处若把transient加上，就可以单独不对age进行持久化操作transient int age

    String department;

    public Student(String name, int id, int age, String department) {
        this.age = age;
        this.department = department;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", age=" + age
                + ", department=" + department + "]";
    }


}
