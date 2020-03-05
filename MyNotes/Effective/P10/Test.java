package Effective.P10;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/5
 * \* Time: 17:38
 * \* Description:
 * \
 */
public class Test {

    public static void main(String[] args) {

        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("ABC");

        String s = "abc";

        /*
        正如所料，cis.equals((Object)s)返回为true，虽然CaseInsensitiveString类中的equals方法知道普通的字符串（String）对象，但是String中的equals方法却并不知道不区分大小写的字符串，因此s.equals((Object)cis)返回为false，显然违反了对称性
         */

        // true
        System.out.println(caseInsensitiveString.equals(s));

        // false
        System.out.println(s.equals(caseInsensitiveString));;

        /*
        为了解决这个问题，只需把企图与String互操作的这段代码从equals方法找中去掉就可以了。这样做之后，就可以重构该方法，使它变成一条单独的返回语句：

         public static void main(String[] args) {
2     CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
3     String s = "polish";
4     System.out.println(cis.equals((Object)s));
5 }
         */



    }
}
