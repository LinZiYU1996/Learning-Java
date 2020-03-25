package Learn_Compile.Demo1.A1;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/24
 * \* Time: 11:53
 * \* Description:
 * \
 */
public class Test_CharArrayReader {


    public static void main(String[] args) throws IOException {


        // /**
        //     * Creates a CharArrayReader from the specified array of chars.
        //     * @param buf       Input buffer (not copied)
        //     */
        //    public CharArrayReader(char buf[]) {
        //        this.buf = buf;
        //        this.pos = 0;
        //        this.count = buf.length;
        //    }

        CharArrayReader charArrayReader = new CharArrayReader("djdskjdfhdfujhfhuHHSHHSHJSH".toCharArray());

        // /**
        //     * Reads a single character.
        //     *
        //     * @exception   IOException  If an I/O error occurs
        //     */
        //    public int read() throws IOException {
        //        synchronized (lock) {
        //            ensureOpen();
        //            if (pos >= count)

        //                return -1;

        //            else
        //                return buf[pos++];
        //        }
        //    }
        System.out.println(charArrayReader.read());

        System.out.println((int)'d');

        System.out.println("");
        System.out.println("");

        int index = 0;
        /*
        顺序输出

         */
        while ( (index = charArrayReader.read()) != -1) {

            System.out.println((char) (charArrayReader.read()));

        }

/*
100
100

ASCII 码

 */




    }
}
