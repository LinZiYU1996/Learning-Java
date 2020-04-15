package better_write.Learn_Netty.My.Decoder_api.P3;

import io.netty.channel.DefaultFileRegion;
import io.netty.channel.FileRegion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 10:19
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("");
        FileInputStream in = new FileInputStream(file);

        FileRegion region = new DefaultFileRegion(
                in.getChannel(),0,file.length()
        );



    }
}
