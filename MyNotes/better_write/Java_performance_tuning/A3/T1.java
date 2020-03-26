package better_write.Java_performance_tuning.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 9:32
 * \* Description:
 * \
 */
public class T1 {

//通过三种不同的方式创建了三个对象，再依次两两匹配，每组被匹配的两个对象是否相等？代码如下：


    public static void main(String[] args) {


        String str1= "abc";
        String str2= new String("abc");
        String str3= str2.intern();

        System.out.println(str1==str2);

        System.out.println(str2==str3);

        System.out.println(str1==str3);
        /*
        false
        false
        true
         */

    }

}
