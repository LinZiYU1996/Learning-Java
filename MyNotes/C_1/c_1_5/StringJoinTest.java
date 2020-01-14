package C_1.c_1_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 20:47
 * \* Description:
 * \
 */
public class StringJoinTest {

    public static void main(String[] args)
    {
        String s1 = "LJava";
        // s2变量引用的字符串可以编译时就确定出来，
        // 因此s2直接引用常量池中已有的"LJava"字符串
        String s2 = "L" + "Java";
        System.out.println(s1 == s2); // 输出true
        // 定义2个字符串直接量
        String str1 = "L";     //①
        String str2 = "Java";     //②
        // 将str1和str2进行连接运算
        String s3 = str1 + str2;
        System.out.println(s1 == s3); // 输出false
    }
}
