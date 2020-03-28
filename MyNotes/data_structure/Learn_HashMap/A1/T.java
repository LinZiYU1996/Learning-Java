package data_structure.Learn_HashMap.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/27
 * \* Time: 10:02
 * \* Description:
 * \
 */
public class T {


    public static void main(String[] args) {

//        HashMap

        Obj obj = new Obj();

//        System.out.println(obj.hashCode());

//        int code = 1111


        System.out.println("hashcode : \n");



        System.out.println(Integer.toBinaryString(obj.hashCode()));

        System.out.println("");

        System.out.println("hashcode 右移 16 为 \n");

        System.out.println(Integer.toBinaryString(((obj.hashCode()) >>> 16)));











    }
    // 将字符串转换成二进制字符串，以空格相隔
    private String StrToBinstr(String str) {
        char[] strChar = str.toCharArray();
        String result = "";
        for (int i = 0; i < strChar.length; i++) {
            result += Integer.toBinaryString(strChar[i]) + " ";
        }
        return result;
    }

}
