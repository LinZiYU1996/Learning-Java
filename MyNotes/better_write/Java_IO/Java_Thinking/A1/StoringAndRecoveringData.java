package better_write.Java_IO.Java_Thinking.A1;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:49
 * \* Description:
 * \
 */
public class StoringAndRecoveringData {


    public static void main(String[] args) throws IOException {


        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("a.txt")
                )
        );

        out.writeDouble(3.2545);

        out.writeUTF("hshhaushahysuhau shshghgdADGUJKAGDFJUHASGFDJHASFGBAQJUH");


        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("a.txt")
                )
        );

        System.out.println(in.readDouble());

        System.out.println("----");

        System.out.println(in.readUTF());





    }

}
