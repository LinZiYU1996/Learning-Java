package better_write.Java_performance_tuning.A3.MeiTuan;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 10:44
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) {

        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
        /*
        false
        true
         */

    }
}
