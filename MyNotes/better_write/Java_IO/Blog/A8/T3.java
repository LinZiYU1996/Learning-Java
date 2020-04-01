package better_write.Java_IO.Blog.A8;


import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 20:53
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\c.txt"));

        BufferedReader reader = new BufferedReader(fileReader);

        String data = null;

        while ((data = reader.readLine()) != null) {

            System.out.println(data);

        }

        reader.close();

    }
}
