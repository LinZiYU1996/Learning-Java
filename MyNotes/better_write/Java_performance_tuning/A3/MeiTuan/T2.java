package better_write.Java_performance_tuning.A3.MeiTuan;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 10:45
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) {

        String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println(s3 == s4);
        /*
        false
        false
         */

    }
}
