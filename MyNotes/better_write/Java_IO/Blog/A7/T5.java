package better_write.Java_IO.Blog.A7;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 10:56
 * \* Description:
 * \
 */
public class T5 {

    public static class Person implements Serializable {
        public String name = null;
        public int    age  =   0;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\person.bin"));

        Person person = new Person();
        person.name = "Jakob Jenkov";
        person.age  = 40;

        objectOutputStream.writeObject(person);
        objectOutputStream.close();


        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\person.bin"));

        Person personRead = (Person) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(personRead.name);
        System.out.println(personRead.age);
    }
}
