package better_write.Netty_Book.serializ.package3;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/20
 * \* Time: 10:10
 * \* Description:
 * \
 */
public class TestSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


//序列化
        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Netty_Book\\serializ\\package3\\student.out");
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        Student student = new Student("jverson", "secret", 'M', 2016);
        System.out.println("origin Object:"+student);
        oout.writeObject(student);
        oout.close();
        //反序列化
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Student deseriStudent = (Student)oin.readObject();
        oin.close();
        System.out.println("recieve Object:"+deseriStudent);
    }
}
