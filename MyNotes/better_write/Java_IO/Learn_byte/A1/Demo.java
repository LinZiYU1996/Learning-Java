package better_write.Java_IO.Learn_byte.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 15:49
 * \* Description:
 * \
 */
public class Demo {


    public static void main(String[] args) {


        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(12);

        System.out.println(stringBuffer.toString());

        System.out.println("");

        String s = "abcdefgjjg";

        System.out.println(s.getBytes());

        System.out.println("");

        for (byte b : s.getBytes()) {

            System.out.println(b);
        }

        //12
        //
        //[B@1b6d3586
        //
        //97
        //98
        //99
        //100
        //101
        //102
        //103
        //106
        //106
        //103



    }
}
